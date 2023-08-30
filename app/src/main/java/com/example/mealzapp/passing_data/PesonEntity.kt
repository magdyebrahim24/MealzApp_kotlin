package com.example.mealzapp.passing_data

import java.io.Serializable

data class PersonEntity(
    val name: String, val age: Int, val country: String
) : Serializable{
    companion object {
        const val Passing_Key = "Hello, world!"
    }
    override fun toString(): String = "Name: $name\nAge: $age\nCountry: $country"

}
