package com.tianyang.android.drinkwaterandstandup.viewModels

import android.arch.lifecycle.MutableLiveData
import com.tianyang.android.drinkwaterandstandup.util.CountDownTimerUtil

class MainActivityViewModel {
    val helloWorldLiveData: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    init {
        CountDownTimerUtil.startCountDownTimer(helloWorldLiveData)
    }
}