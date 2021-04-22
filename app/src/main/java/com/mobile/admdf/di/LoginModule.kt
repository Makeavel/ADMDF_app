package com.mobile.admdf.di

import com.mobile.admdf.interactor.LoginInteractor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class LoginModule {

    @Provides
    fun getInteractor() = LoginInteractor()
}