package com.me.louguiyu.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.me.louguiyu.R
import com.me.louguiyu.data.viewModel.SplashViewModel
import com.me.louguiyu.databinding.ActivitySplashBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class SplashActivity: AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding
    val viewModel: SplashViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }
}

