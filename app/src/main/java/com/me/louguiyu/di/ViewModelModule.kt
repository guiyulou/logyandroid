package com.me.louguiyu.di

import com.me.louguiyu.data.viewModel.SplashViewModel
import io.reactivex.disposables.CompositeDisposable
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    factory { CompositeDisposable() }

    viewModel { SplashViewModel(get(), get(), get()) }
}