package com.example.mealzapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mealzapp.R
import com.example.mealzapp.databinding.CustomToastBinding
import com.example.mealzapp.databinding.ToastViewBinding

class ToastActivity : AppCompatActivity() {
    private lateinit var binding: ToastViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.toast_view)
        binding = ToastViewBinding.inflate(layoutInflater)

        // Toast View Page

        binding.showToastBTN.setOnClickListener {
            Toast.makeText(this, "Hi iam Toast", Toast.LENGTH_SHORT).show()
        }

        val customToastBinding = CustomToastBinding.inflate(layoutInflater)
        binding.showCustomToastBTN.setOnClickListener {
            Toast(this).apply {
                duration = Toast.LENGTH_LONG
                view = layoutInflater.inflate(R.layout.custom_toast, customToastBinding.customToast)
                show()
            }
        }
    }
}