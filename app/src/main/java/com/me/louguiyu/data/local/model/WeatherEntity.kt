package com.me.louguiyu.data.local.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class WeatherEntity (
    @PrimaryKey val city: String,
    val weatherCondition: String
)