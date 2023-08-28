package com.example.data.repo

import com.example.data.remote.ApiService
import com.example.domain.models.Category
import com.example.domain.repo.MealsRepo

class MealsRepoImpl(private val apiService: ApiService) : MealsRepo {
    override suspend fun getMealsFromRemote(): List<Category> = apiService.getMeals();
}