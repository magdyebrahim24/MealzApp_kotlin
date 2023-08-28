package com.example.domain.repo

import com.example.domain.models.Category
import com.example.domain.models.MealzEntity

interface MealsRepo {
   suspend fun getMealsFromRemote(): List<Category>
}