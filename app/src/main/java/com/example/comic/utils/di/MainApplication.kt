package com.tuanlvt.mvvm.utils.di

import android.app.Application
import com.example.comic.data.di.dataSourceModule
import com.example.comic.data.di.networkModule
import com.example.comic.data.di.repositoryModule
import com.example.comic.utils.di.appModule
import com.example.comic.utils.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

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
            androidLogger()
            androidContext(this@MainApplication)
            modules(modules)
        }
    }
}
