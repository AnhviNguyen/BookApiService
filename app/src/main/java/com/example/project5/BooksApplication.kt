package com.example.project5

import android.app.Application
import com.example.project5.data.AppContainer
import com.example.project5.data.DefaultAppContainer

class BooksApplication: Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}