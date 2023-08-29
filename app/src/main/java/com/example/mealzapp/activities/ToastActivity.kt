package com.example.mealzapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.mealzapp.R
import com.example.mealzapp.databinding.CustomToastBinding
import com.example.mealzapp.databinding.ToastViewBinding

class ToastActivity : AppCompatActivity() {
    private lateinit var binding: ToastViewBinding
    private lateinit var customToastBinding: CustomToastBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ToastViewBinding.inflate(layoutInflater)
        customToastBinding = CustomToastBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Toast View Page

        binding.showToastBTN.setOnClickListener {
            Toast.makeText(this, "Hi iam Toast", Toast.LENGTH_SHORT).show()
            Log.d("TestBackBTN", "BACK BACK")
        }

        binding.showCustomToastBTN.setOnClickListener {
            Log.d("TestBackBTN", "BACK BACK")

            Toast(this).apply {
                duration = Toast.LENGTH_LONG
                view = layoutInflater.inflate(R.layout.custom_toast, customToastBinding.customToast)
                show()
            }
        }

        binding.backBTN.setOnClickListener {
            Log.d("TestBackBTN", "BACK BACK")
            finish()
        }
    }
}