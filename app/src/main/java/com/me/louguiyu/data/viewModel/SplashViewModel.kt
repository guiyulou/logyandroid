package com.me.louguiyu.data.viewModel

import androidx.lifecycle.ViewModel
import com.me.louguiyu.AppScheduler
import com.me.louguiyu.data.repository.WeatherRepository
import io.reactivex.disposables.CompositeDisposable

class SplashViewModel(
    private val repository: WeatherRepository,
    private val scheduler: AppScheduler,
    private val compositeDisposable: CompositeDisposable
): ViewModel() {

}