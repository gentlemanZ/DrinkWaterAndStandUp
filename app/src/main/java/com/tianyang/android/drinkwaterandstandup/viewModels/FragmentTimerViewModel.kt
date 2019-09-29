package com.tianyang.android.drinkwaterandstandup.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.navigation.NavController
import com.tianyang.android.drinkwaterandstandup.util.CountDownTimerUtil

class FragmentTimerViewModel {
    var navController: NavController? = null

    val helloWorldLiveData: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    init {
        CountDownTimerUtil.startCountDownTimer(helloWorldLiveData, 300)
    }

}