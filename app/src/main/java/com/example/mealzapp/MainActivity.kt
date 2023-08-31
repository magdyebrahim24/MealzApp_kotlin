package com.example.mealzapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.mealzapp.activities.AlertActivity
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

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

        binding.BTNAlerts.setOnClickListener {
            Intent(this,AlertActivity::class.java).also {
                startActivity(it)
            }
        }

    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        println("item.itemId ${item.itemId}")
        when (item.itemId) {
            R.id.miAddBookMark -> Toast.makeText(this, "Add Book Mark Success", Toast.LENGTH_SHORT)
                .show()

            R.id.miFavorite -> Toast.makeText(this, "Add To Favorite Success", Toast.LENGTH_SHORT)
                .show()

            R.id.miInfo -> Toast.makeText(this, "Set Information", Toast.LENGTH_SHORT).show()
            R.id.miSetting -> Toast.makeText(this, "Go To Setting", Toast.LENGTH_SHORT).show()
            R.id.miNotification -> Toast.makeText(this, "Receive Notification", Toast.LENGTH_SHORT)
                .show()

            R.id.miInfo -> Toast.makeText(this, "Test App Info Learn Android", Toast.LENGTH_SHORT)
                .show()

            R.id.miClose -> finish()
        }
        return true
    }

}