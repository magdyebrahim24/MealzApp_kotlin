package com.example.mealzapp.passing_data

import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.mealzapp.databinding.PassingDataSecondViewBinding

class PassingDataSecondActivity : AppCompatActivity() {
    private lateinit var binding: PassingDataSecondViewBinding

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PassingDataSecondViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val personData: PersonEntity? =
            intent.getSerializableExtra(PersonEntity.Passing_Key, PersonEntity::class.java)

        if (personData != null) {
            binding.etPersonData.text = personData.toString()
        }

        binding.BTNBack.setOnClickListener {
            finish()
        }
    }
}