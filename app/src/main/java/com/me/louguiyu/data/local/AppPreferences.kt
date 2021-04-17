package com.me.louguiyu.data.local

import android.content.Context
import android.content.SharedPreferences

class AppPreferences(context: Context) {
    private val sharedPreference: SharedPreferences

    companion object {
        private const val SHARED_PREFS = "MyApp_Prefs"
    }

    init {
        sharedPreference = context.getSharedPreferences(SHARED_PREFS, Context.MODE_PRIVATE)
    }
}