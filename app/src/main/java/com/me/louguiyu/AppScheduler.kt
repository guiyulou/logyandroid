package com.me.louguiyu

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Scheduler
import io.reactivex.rxjava3.schedulers.Schedulers


interface AppScheduler {
    fun mainThread(): Scheduler
    fun io(): Scheduler
}

class AppSchedulerImpl : AppScheduler {
    override fun mainThread(): Scheduler = AndroidSchedulers.mainThread()
    override fun io() = Schedulers.io()
}