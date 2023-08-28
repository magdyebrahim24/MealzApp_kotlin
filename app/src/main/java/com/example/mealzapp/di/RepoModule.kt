package com.example.mealzapp.di

import com.example.data.remote.ApiService
import com.example.data.repo.MealsRepoImpl
import com.example.domain.repo.MealsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
object RepoModule {
    @Provides
    fun provideMealsRepo(apiService: ApiService): MealsRepo {
        return MealsRepoImpl(apiService)
    }
}