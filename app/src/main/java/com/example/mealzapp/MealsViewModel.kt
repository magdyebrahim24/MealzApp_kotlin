package com.example.mealzapp

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.use_cases.GetMealsUseCase
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltAndroidApp
class MealsViewModel @Inject constructor(private val getMealsUseCase: GetMealsUseCase) :
    ViewModel() {
    fun getMeals() {
        viewModelScope.launch {
            try {
                getMealsUseCase()
            } catch (e: Exception) {
                Log.e("MealsViewModel", e.message.toString())
            }
        }
    }
}