package com.me.louguiyu.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.me.louguiyu.data.local.model.WeatherEntity
import io.reactivex.Single

@Dao
interface WeatherDao {
    @Insert
    fun addWeather(weather: WeatherEntity)

    @Query("SELECT * FROM weatherentity WHERE city = :city")
    fun getWeather(city: String): Single<WeatherEntity>
}