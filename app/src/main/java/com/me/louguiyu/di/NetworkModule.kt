package com.me.louguiyu.di

import android.content.Context
import com.me.louguiyu.BuildConfig
import com.me.louguiyu.data.remote.service.WeatherService
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


val networkModule = module {
    single { createNetworkCache(get()) }
//    single { createAuthenticationInterceptor() }
    single { createOkHttpClient(get(), get())}//get()) }
    single { createRetrofit(get()) }
    single { createWeatherService(get()) }
}



private fun createNetworkCache(context: Context): Cache {
    val cacheSize = 10 * 1024 * 1024 // 10 MiB
    return Cache(context.cacheDir, cacheSize.toLong())
}

// TODO
//private fun createAuthenticationInterceptor(): AuthenticationInterceptor {
//    return AuthenticationInterceptor()
//}

private fun createOkHttpClient(
    cache: Cache,
    context: Context,
//    authenticationInterceptor: AuthenticationInterceptor
): OkHttpClient {
    val builder = OkHttpClient.Builder()
    builder.connectTimeout(30, TimeUnit.SECONDS)
    builder.writeTimeout(30, TimeUnit.SECONDS)
    builder.readTimeout(30, TimeUnit.SECONDS)
    builder.cache(cache)

    if (BuildConfig.DEBUG) {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        builder.addNetworkInterceptor(interceptor)
    }

//    builder.authenticator(authenticationInterceptor)

    return builder.build()
}

private fun createRetrofit(okHttpClient: OkHttpClient): Retrofit =
    Retrofit.Builder()
        .baseUrl(BuildConfig.API_BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()

private fun createWeatherService(retrofit: Retrofit): WeatherService = retrofit.create(WeatherService::class.java)