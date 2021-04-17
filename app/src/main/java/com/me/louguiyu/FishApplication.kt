package com.me.louguiyu

import android.app.Application
import com.me.louguiyu.di.networkModule
import com.me.louguiyu.di.repoModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import timber.log.Timber

class FishApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        startKoin {
            androidLogger()
            androidContext(this@FishApplication)
            modules(listOf(networkModule, repoModule))
        }
    }

}