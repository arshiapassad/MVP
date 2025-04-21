package com.example.mvp.retrofit.ui.favorite

import academy.nouri.s3_mvp.base.BasePresenterImpl
import com.example.mvp.retrofit.data.repository.FavoriteRepository
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Inject

class FavoritePresenter @Inject constructor(private val repository: FavoriteRepository, val view: FavoriteContracts.View):
    BasePresenterImpl(), FavoriteContracts.Presenter{

    override fun loadAllFood() {
        disposable = repository.loadAllFoods()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe{
                if (it.isNotEmpty()){
                    view.showAllFoods(it)
                }else{
                    //Empty
                }
            }
    }
}