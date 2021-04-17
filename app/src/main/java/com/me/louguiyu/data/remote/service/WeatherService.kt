package com.me.louguiyu.data.remote.service

import com.me.louguiyu.data.remote.response.WeatherResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherService {

    @GET("weather")
    fun getSingaporeHourlyWeather(
        @Query("q") cities: String = "Singapore",
        @Query("appid") id: String = "c1b4d885136c68a578ace4933ccaa3a0"
    ): Single<WeatherResponse>
}