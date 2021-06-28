package com.example.comic.utils.di

import android.app.Application
import com.example.comic.data.di.dataSourceModule
import com.example.comic.data.di.networkModule
import com.example.comic.data.di.repositoryModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        val modules = listOf(
            appModule,
            repositoryModule,
            dataSourceModule,
            networkModule,
            viewModelModule
        )
        startKoin {
            androidLogger(Level.ERROR)
            androidContext(this@MainApplication)
            modules(modules)
        }
    }
}
