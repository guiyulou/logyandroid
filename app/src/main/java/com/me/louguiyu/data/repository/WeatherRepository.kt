package com.me.louguiyu.data.repository

import com.me.louguiyu.data.remote.service.WeatherService

class WeatherRepository constructor(
    private val api: WeatherService
) {
    fun getSingaporeWeather() = api.getSingaporeHourlyWeather()
}