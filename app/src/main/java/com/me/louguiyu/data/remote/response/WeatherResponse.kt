package com.me.louguiyu.data.remote.response

import com.google.gson.annotations.SerializedName

data class WeatherResponse (
    @SerializedName("name") val name: String,
    @SerializedName("weather") val weather: List<WeatherObjectResponse>
)

data class WeatherObjectResponse (
    @SerializedName("id") val id: String,
    @SerializedName("main") val main: String,
    @SerializedName("description") val description: String,
    @SerializedName("icon") val icon: String
)