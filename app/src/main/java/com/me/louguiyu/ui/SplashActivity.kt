package com.me.louguiyu.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.me.louguiyu.R
import com.me.louguiyu.databinding.ActivitySplashBinding

class SplashActivity: AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }
}

