package com.example.mvp.retrofit.ui.detail

import academy.nouri.s3_mvp.base.BasePresenter
import academy.nouri.s3_mvp.base.BaseView
import academy.nouri.s3_mvp.retrofit.data.model.home.ResponseFoodsList
import com.example.mvp.retrofit.data.database.FoodEntity

interface DetailContracts {
    interface View : BaseView{
        fun loadDetail(data: ResponseFoodsList)
        fun updateFavorite(isAdded:Boolean)
    }

    interface Presenter : BasePresenter{
        fun callDetailApi(id: Int)
        fun saveFood(entity: FoodEntity)
        fun deleteFood(entity: FoodEntity)
        fun checkFavorite(id: Int)
    }
}