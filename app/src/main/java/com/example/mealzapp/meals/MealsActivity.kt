package com.example.mealzapp.meals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.RecyclerView
import com.example.mealzapp.R
import com.example.mealzapp.databinding.CategoryItemBinding
import com.example.mealzapp.databinding.MealsViewBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint

class MealsActivity : AppCompatActivity() {
    private val viewModel: MealsViewModel by viewModels()
    private lateinit var binding: MealsViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MealsViewBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val rv: RecyclerView = binding.categoryRv
        viewModel.getMeals()

        val mealsAdapter = MealsAdapter()

        lifecycleScope.launch {
            viewModel.categories.collect {
                mealsAdapter.submitList(it?.categories)
                rv.adapter = mealsAdapter
            }
        }
    }
}