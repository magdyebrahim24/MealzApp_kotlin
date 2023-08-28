package com.example.mealzapp.meals
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.models.Category
import com.example.domain.models.MealzEntity
import com.example.domain.use_cases.GetMealsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class MealsViewModel @Inject constructor(private val getMealsUseCase: GetMealsUseCase) :
    ViewModel() {

    private val _categories: MutableStateFlow<MealzEntity?> = MutableStateFlow(null)
    val categories: StateFlow<MealzEntity?> = _categories

    fun getMeals() {
        viewModelScope.launch {
            try {
                _categories.value = getMealsUseCase()
            } catch (e: Exception) {
                Log.e("MealsViewModel", e.message.toString())
            }
        }
    }
}