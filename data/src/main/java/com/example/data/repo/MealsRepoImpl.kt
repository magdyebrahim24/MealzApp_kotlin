package com.example.data.repo

import com.example.data.remote.ApiService
import com.example.domain.models.MealzEntity
import com.example.domain.repo.MealsRepo

class MealsRepoImpl(private val apiService: ApiService) : MealsRepo {
    override suspend fun getMealsFromRemote(): MealzEntity = apiService.getMeals();
}