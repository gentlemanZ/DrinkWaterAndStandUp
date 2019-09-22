package com.tianyang.android.drinkwaterandstandup.viewModels

import android.arch.lifecycle.MutableLiveData

class MainActivityViewModel {
    val helloWorldLiveData: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    init {
        helloWorldLiveData.postValue("hello world")
    }
}