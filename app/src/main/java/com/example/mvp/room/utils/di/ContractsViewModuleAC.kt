package com.example.mvp.room.utils.di

import android.app.Activity
import com.example.mvp.room.ui.main.MainContracts
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
class ContractsViewModuleAC {

    @Provides
    fun mainView(activity: Activity): MainContracts.View{
        return activity as MainContracts.View
    }
}