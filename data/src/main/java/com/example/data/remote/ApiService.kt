package com.example.data.remote

import com.example.domain.models.Category
import retrofit2.http.GET

interface ApiService {

    @GET("categories.php")
    fun getMeals(): List<Category>
}