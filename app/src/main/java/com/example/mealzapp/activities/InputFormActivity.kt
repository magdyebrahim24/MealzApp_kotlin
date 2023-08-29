package com.example.mealzapp.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mealzapp.databinding.InputFormBinding

class InputFormActivity : AppCompatActivity() {
    private lateinit var binding: InputFormBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = InputFormBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val infoResultTextView = binding.infoResultTextView

        binding.BTNSave.setOnClickListener {
            val etFirstName = binding.etFirstName.text.toString()
            val etLastName = binding.etLastName.text.toString()
            val etEmailAddress = binding.etEmailAddress.text.toString()
            val etCountry = binding.etCountry.text.toString()

            infoResultTextView.text =
                "FirstName : $etFirstName\nLastName: $etLastName\nEmailAddress: $etEmailAddress\nCountry: $etCountry"
        }
    }
}