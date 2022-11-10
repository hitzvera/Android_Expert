package com.dicoding.mysimplelogin

import android.app.Application
import android.content.Context
import com.dicoding.mysimplelogin.di.AppComponent
import com.dicoding.mysimplelogin.di.DaggerAppComponent
import com.dicoding.mysimplelogin.di.StorageModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

open class MyApplication : Application(){
    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(
            applicationContext
        )
    }
}