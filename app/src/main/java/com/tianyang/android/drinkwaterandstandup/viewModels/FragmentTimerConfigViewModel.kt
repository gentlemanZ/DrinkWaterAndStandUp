package com.tianyang.android.drinkwaterandstandup.viewModels

import androidx.lifecycle.MutableLiveData
import com.tianyang.android.drinkwaterandstandup.util.CountDownTimerUtil

class FragmentTimerConfigViewModel {
    val helloWorldLiveData: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    init {
        CountDownTimerUtil.startCountDownTimer(helloWorldLiveData, 30)
    }
}