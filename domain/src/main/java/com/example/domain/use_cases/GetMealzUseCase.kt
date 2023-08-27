package com.example.domain.use_cases

import com.example.domain.models.Category
import com.example.domain.repo.MealsRepo

/*
 private val repo: MealsRepo
 private ==> access modifier
 repo ==> name
 val ==> variable type like final its value dont change
 MealsRepo == > typeOf Variable
 */

class GetMealsUseCase(private val repo: MealsRepo) {
    // callable method [operator fun invoke()] which GetMealsUseCase()
    // has return type List<Category>
    // which implements getMealsFromRemote fun
    // suspend like async
    suspend operator fun invoke(): List<Category> = repo.getMealsFromRemote()
}