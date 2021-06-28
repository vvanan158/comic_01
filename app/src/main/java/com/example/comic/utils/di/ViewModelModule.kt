package com.example.comic.utils.di

import com.example.comic.screen.container.ContainerViewModel
import com.example.comic.screen.home.HomeViewModel
import com.example.comic.screen.main.MainViewModel
import com.example.comic.screen.me.MeViewModel
import org.koin.dsl.module

val viewModelModule = module {
    single { MainViewModel() }

    single { ContainerViewModel() }

    single { HomeViewModel() }

    single { MeViewModel() }
}
