package com.example.mealzapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.mealzapp.R
import com.example.mealzapp.databinding.ActivityAlertBinding

class AlertActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAlertBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlertBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.materialToolbar)

        binding.materialToolbar.setNavigationOnClickListener{
            finish()
        }

        val addContactAlert = AlertDialog.Builder(this)
            .setTitle("Add Contact")
            .setMessage("Do You Want To Add magdy To Your Contacts")
            .setIcon(R.drawable.ic_add_bookmark)
            .setPositiveButton("Yes") { _, _ ->
                Toast.makeText(
                    this,
                    "Added Success",
                    Toast.LENGTH_SHORT
                ).show()
            }
            .setNegativeButton("No") { _, _ ->
                Toast.makeText(
                    this,
                    "Decline Success",
                    Toast.LENGTH_SHORT
                ).show()
            }
        binding.BTNShowContact.setOnClickListener {
            addContactAlert.show()
        }

        val choices: Array<String> = arrayOf("First Item ", "Second Item", "Third Item")

        val addSingleChoiceAlert = AlertDialog.Builder(this)
            .setTitle("Add Contact")
            .setSingleChoiceItems(choices, 0) { _, i ->
                Toast.makeText(
                    this,
                    "You Choice ${choices[i]}",
                    Toast.LENGTH_SHORT
                ).show()
            }
            .setPositiveButton("Select") { _, _ ->
                Toast.makeText(
                    this,
                    "Select Success",
                    Toast.LENGTH_SHORT
                ).show()
            }
            .setNegativeButton("Cancel") { _, _ ->
                Toast.makeText(
                    this,
                    "Canceled",
                    Toast.LENGTH_SHORT
                ).show()
            }
        binding.BTNSingleChoiceContact.setOnClickListener {
            addSingleChoiceAlert.show()
        }

        val addMultiChoiceAlert = AlertDialog.Builder(this)
            .setTitle("Multi Add Contact")
            .setMultiChoiceItems(choices, booleanArrayOf(false, false, false)) { _, i, isChecked ->
                if (isChecked) {
                    Toast.makeText(
                        this,
                        "You Choice ${choices[i]} is Checked",
                        Toast.LENGTH_SHORT
                    ).show()

                } else {
                    Toast.makeText(
                        this,
                        "You Choice ${choices[i]} is UN Checked",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
            .setPositiveButton("Select") { _, _ ->
                Toast.makeText(
                    this,
                    "Select Success",
                    Toast.LENGTH_SHORT
                ).show()
            }
            .setNegativeButton("Cancel") { _, _ ->
                Toast.makeText(
                    this,
                    "Canceled",
                    Toast.LENGTH_SHORT
                ).show()
            }
        binding.BTNSingleChoiceContact.setOnClickListener {
            addSingleChoiceAlert.show()
        }

        binding.BTNMultiChoiceContact.setOnClickListener {
            addMultiChoiceAlert.show()
        }
    }

}