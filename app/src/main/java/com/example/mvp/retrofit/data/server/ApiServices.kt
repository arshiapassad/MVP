package com.example.mvp.retrofit.data.server

import academy.nouri.s3_mvp.retrofit.data.model.home.ResponseCategoriesList
import academy.nouri.s3_mvp.retrofit.data.model.home.ResponseFoodsList
import io.reactivex.rxjava3.core.Single
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiServices{
    @GET("random.php")
    fun foodRandom(): Single<Response<ResponseFoodsList>>

    @GET("categories.php")
    fun categoriesList(): Single<Response<ResponseCategoriesList>>

    @GET("search.php")
    fun foodsList(@Query("f")letter: String): Single<Response<ResponseFoodsList>>

    @GET("search.php")
    fun searchFood(@Query("s")letter: String): Single<Response<ResponseFoodsList>>

    @GET("filter.php")
    fun foodByCategory(@Query("c")letter: String): Single<Response<ResponseFoodsList>>

    @GET("lookup.php")
    fun foodsDetail(@Query("i") id : Int): Single<Response<ResponseFoodsList>>
}