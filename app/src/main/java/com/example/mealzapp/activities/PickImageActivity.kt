package com.example.mealzapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.result.contract.ActivityResultContracts
import com.example.mealzapp.R
import com.example.mealzapp.databinding.PickImageViewBinding

class PickImageActivity : AppCompatActivity() {
    private lateinit var binding:PickImageViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = PickImageViewBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.BTNPickImage.setOnClickListener {
            Intent(Intent.ACTION_GET_CONTENT).also {
                it.type = "image/*"
                imagePickerLauncher.launch(it)
            }
        }
    }

    private val imagePickerLauncher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            Log.d("test",result.toString())
            if (result.resultCode == RESULT_OK) {
                val data: Intent? = result.data
                if (data != null) {
                    val selectedImageUri = data.data
                    binding.ivPickedImage.setImageURI(selectedImageUri)
                }
            }
        }


}