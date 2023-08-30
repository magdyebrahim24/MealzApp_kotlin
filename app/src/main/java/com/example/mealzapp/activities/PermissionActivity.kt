package com.example.mealzapp.activities

import android.content.pm.PackageManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mealzapp.databinding.PermissionViewBinding

class PermissionActivity : AppCompatActivity() {
    private lateinit var binding: PermissionViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PermissionViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.BYNAskPermission.setOnClickListener {
            requestPermission()
        }
    }

    private fun requestPermission() {
//        if(!hasLocationPermission()){
//            requestPermissions( String[] {Manifest.permission.READ_EXTERNAL_STORAGE},
//                1);
//        }
    }

    private fun hasLocationPermission() = applicationContext.packageManager.hasSystemFeature(
        PackageManager.FEATURE_LOCATION
    )

    private fun hasLOCATIONGpsPermission() = applicationContext.packageManager.hasSystemFeature(
        PackageManager.FEATURE_LOCATION_GPS
    )
}