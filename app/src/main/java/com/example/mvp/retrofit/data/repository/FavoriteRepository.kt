package com.example.mvp.retrofit.data.repository

import com.example.mvp.retrofit.data.database.FoodDao
import javax.inject.Inject

class FavoriteRepository @Inject constructor(private val dao: FoodDao){
    fun loadAllFoods() = dao.getAllFoods()
}