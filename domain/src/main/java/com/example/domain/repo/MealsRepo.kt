package com.example.domain.repo

import com.example.domain.models.MealzEntity

interface MealsRepo {
   suspend fun getMealsFromRemote(): MealzEntity
}