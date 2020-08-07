package com.sunnyweather.andorid

import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {

    companion object {
        lateinit var context: Context
        const val TOKEN = "vA7Vm01MzhFPuBkN"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}