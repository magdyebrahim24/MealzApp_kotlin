package com.example.mealzapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.RecyclerView
import com.example.mealzapp.databinding.CounterViewBinding
import com.example.mealzapp.databinding.InputFormBinding
import com.example.mealzapp.meals.MealsAdapter
import com.example.mealzapp.meals.MealsViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val viewModel: MealsViewModel by viewModels()
    private lateinit var binding: CounterViewBinding


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CounterViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Counter Page  -------------------------
        var counter: Int = 0
        binding.BTNIncrease.setOnClickListener{
            counter++
            binding.tvCountText.text = counter.toString()
        }
        binding.BTNRest.setOnClickListener {
            counter = 0
            binding.tvCountText.text = counter.toString()
        }


        // Input Form ----------------------------------
//        val infoResultTextView = binding.infoResultTextView
//
//        binding.BTNSave.setOnClickListener {
//            val etFirstName = binding.etFirstName.text.toString()
//            val etLastName = binding.etLastName.text.toString()
//            val etEmailAddress = binding.etEmailAddress.text.toString()
//            val etCountry = binding.etCountry.text.toString()
//
//            infoResultTextView.text =
//                "FirstName : $etFirstName\nLastName: $etLastName\nEmailAddress: $etEmailAddress\nCountry: $etCountry"
//        }


        // Category List With Ali Course--------------------------------------

//        val rv: RecyclerView = findViewById(R.id.category_rv)
//        viewModel.getMeals()
//
//        val mealsAdapter = MealsAdapter()
//
//        lifecycleScope.launch {
//            viewModel.categories.collect {
//                mealsAdapter.submitList(it?.categories)
//                rv.adapter = mealsAdapter
//            }
//        }


    }

}