package com.tianyang.android.drinkwaterandstandup.viewModels

import android.arch.lifecycle.MutableLiveData
import io.reactivex.Observable
import java.util.concurrent.TimeUnit

class MainActivityViewModel {
    private val countDownTimerObserble: Observable<Long> = Observable
        .interval(1, TimeUnit.SECONDS)
        .map {
            it
        }
    val helloWorldLiveData: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    init {
        countDownTimerObserble
            .doOnEach {
                helloWorldLiveData.postValue(it.value.toString())
            }
            .subscribe()
    }
}