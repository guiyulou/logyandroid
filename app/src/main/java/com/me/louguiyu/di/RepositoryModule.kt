package com.me.louguiyu.di

import com.me.louguiyu.data.repository.WeatherRepository
import org.koin.dsl.module

val repoModule = module {
    single { WeatherRepository(get()) }
}