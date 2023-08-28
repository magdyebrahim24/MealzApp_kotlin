package com.example.data.remote

import com.example.domain.models.MealzEntity
import retrofit2.http.GET

interface ApiService {

    @GET("categories.php")
    suspend fun getMeals(): MealzEntity
}