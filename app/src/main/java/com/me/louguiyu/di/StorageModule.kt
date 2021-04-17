package com.me.louguiyu.di

import com.me.louguiyu.data.local.AppPreferences
import com.me.louguiyu.data.local.RoomHelper
import org.koin.dsl.module

val storageModule = module {
    single { AppPreferences(get()) }
    single { RoomHelper.getDatabase(get()) }
}