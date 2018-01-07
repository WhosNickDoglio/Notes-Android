package com.nicholasdoglio.notes

import android.app.Activity
import android.app.Application
import com.nicholasdoglio.notes.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

/**
 * @author Nicholas Doglio
 */
class NotesApplication : Application(), HasActivityInjector {

    //TODO Focus on MVVM and being reactive
    //TODO Add more comments and tests
    //TODO Updated README
    //TODO Make it more Kotlin-y
    //TODO Study Material Design spec and make this not look awful
    //TODO Tablet support

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun activityInjector(): AndroidInjector<Activity> = dispatchingAndroidInjector

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder()
                .application(this)
                .build()
                .inject(this)
    }
}