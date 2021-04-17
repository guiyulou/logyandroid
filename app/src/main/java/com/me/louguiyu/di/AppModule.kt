package com.me.louguiyu.di

import com.me.louguiyu.AppScheduler
import com.me.louguiyu.AppSchedulerImpl
import org.koin.dsl.module

val appModule = module {
    single<AppScheduler> { AppSchedulerImpl() }
}