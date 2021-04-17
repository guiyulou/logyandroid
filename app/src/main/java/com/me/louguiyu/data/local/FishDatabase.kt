package com.me.louguiyu.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.me.louguiyu.data.local.dao.WeatherDao
import com.me.louguiyu.data.local.model.WeatherEntity

@Database(entities = [WeatherEntity::class], version = 1)

abstract class FishDatabase: RoomDatabase() {
    abstract fun weatherDao(): WeatherDao
}