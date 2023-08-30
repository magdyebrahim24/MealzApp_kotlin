package com.example.mealzapp.passing_data

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mealzapp.databinding.PassingDataFirstViewBinding

class PassingDataFirstActivity : AppCompatActivity() {
    private lateinit var binding: PassingDataFirstViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PassingDataFirstViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.BTNSave.setOnClickListener {
            val name: String = binding.etName.text.toString()
            val age: Int = binding.etAge.text.toString().toInt()
            val country: String = binding.etCountry.text.toString()

            val personData: PersonEntity = PersonEntity(name, age, country)
            Intent(this, PassingDataSecondActivity::class.java).also {
                it.putExtra(PersonEntity.Passing_Key, personData)
                startActivity(it)
            }
        }

        binding.BTNBack.setOnClickListener {
            finish()
        }
    }
}