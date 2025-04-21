package com.example.mvp.retrofit.ui.favorite

import academy.nouri.s3_mvp.base.BasePresenter
import com.example.mvp.retrofit.data.database.FoodEntity

interface FavoriteContracts {
    interface View{
        fun showAllFoods(list: MutableList<FoodEntity>)
    }

    interface Presenter : BasePresenter{
        fun loadAllFood()
    }
}