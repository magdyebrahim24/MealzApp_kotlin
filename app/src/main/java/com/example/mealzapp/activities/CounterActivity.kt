package com.example.mealzapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mealzapp.R
import com.example.mealzapp.databinding.CounterViewBinding
import com.example.mealzapp.databinding.ToastViewBinding

class CounterActivity : AppCompatActivity() {
    private lateinit var binding: CounterViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CounterViewBinding.inflate(layoutInflater)
        setContentView(R.layout.counter_view)

        var counter: Int = 0
        binding.BTNIncrease.setOnClickListener {
            counter++
            binding.tvCountText.text = counter.toString()
        }
        binding.BTNRest.setOnClickListener {
            counter = 0
            binding.tvCountText.text = counter.toString()
        }
    }
}