package com.example.mealzapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mealzapp.activities.CounterActivity
import com.example.mealzapp.activities.InputFormActivity
import com.example.mealzapp.activities.PermissionActivity
import com.example.mealzapp.activities.PickImageActivity
import com.example.mealzapp.activities.ToastActivity
import com.example.mealzapp.databinding.ActivityMainBinding
import com.example.mealzapp.meals.MealsActivity
import com.example.mealzapp.passing_data.PassingDataFirstActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toastViewBTN.setOnClickListener {
            Intent(this, ToastActivity::class.java).also {
                startActivity(it)
            }
        }
        binding.counterViewBTN.setOnClickListener {
            Intent(this, CounterActivity::class.java).also {
                startActivity(it)
            }
        }
        binding.mealsViewBTN.setOnClickListener {
            Intent(this, MealsActivity::class.java).also {
                startActivity(it)
            }
        }
        binding.inputFormViewBTN.setOnClickListener {
            Intent(this, InputFormActivity::class.java).also {
                startActivity(it)
            }
        }

        binding.BTNPassingData.setOnClickListener {
            Intent(this, PassingDataFirstActivity::class.java).also {
                startActivity(it)
            }
        }

        binding.BTNAskPermission.setOnClickListener {
            Intent(this, PermissionActivity::class.java).also {
                startActivity(it)
            }
        }

        binding.BTNPickImage.setOnClickListener {
            Intent(this, PickImageActivity::class.java).also {
                startActivity(it)
            }
        }

    }

}