package com.example.mvp.retrofit.data.repository

import com.example.mvp.retrofit.data.server.ApiServices
import javax.inject.Inject

class HomeRepository @Inject constructor(private val api: ApiServices){
    fun loadFoodRandom() = api.foodRandom()
    fun loadCategoriesList() = api.categoriesList()
    fun loadFoodList(letter: String) = api.foodsList(letter)
    fun loadSearchFood(letter: String) = api.searchFood(letter)
    fun loadFoodsByCategory(letter: String) = api.foodByCategory(letter)
}