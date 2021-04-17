package com.me.louguiyu.data.local

import android.content.Context
import androidx.room.Room

object RoomHelper {
    private lateinit var database: FishDatabase

    fun getDatabase(context: Context?): FishDatabase {
        if (!::database.isInitialized) {
            database = Room.databaseBuilder(context!!, FishDatabase::class.java, "FishDatabase")
                .fallbackToDestructiveMigration()
                .build()
        }
        return database
    }

}