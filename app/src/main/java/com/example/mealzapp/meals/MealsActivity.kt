package com.example.mealzapp.meals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.RecyclerView
import com.example.mealzapp.R
import com.example.mealzapp.databinding.CategoryItemBinding
import kotlinx.coroutines.launch

class MealsActivity : AppCompatActivity() {
    private val viewModel: MealsViewModel by viewModels()
    private lateinit var binding: CategoryItemBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CategoryItemBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val rv: RecyclerView = findViewById(R.id.category_rv)
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