package com.mobile.admdf.di

import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.mobile.admdf.interactor.CadastroInteractor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class CadastroModule {

    @Provides
    fun provideFirebaseAuth() = Firebase.auth

    @Provides
    fun getInteractor() = CadastroInteractor()
}