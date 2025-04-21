package com.example.mvp.retrofit.ui.home

import academy.nouri.s3_mvp.base.BasePresenter
import academy.nouri.s3_mvp.base.BaseView
import academy.nouri.s3_mvp.retrofit.data.model.home.ResponseCategoriesList
import academy.nouri.s3_mvp.retrofit.data.model.home.ResponseFoodsList

interface HomeContracts {
    interface View:BaseView{
        fun loadFoodRandom(data: ResponseFoodsList)
        fun loadCategories(data: ResponseCategoriesList)
        fun loadFoodsList(data: ResponseFoodsList)
        fun foodsLoadingState(isShown: Boolean)
        fun emptyList()
    }
    interface Presenter : BasePresenter{
        fun callFoodRandom()
        fun callCategoriesList()
        fun callFoodsList(letter: String)
        fun callSearchFood(letter: String)
        fun callFoodsByCategory(letter: String)
    }
}