package com.tianyang.android.drinkwaterandstandup.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.navigation.NavController
import com.tianyang.android.drinkwaterandstandup.R
import com.tianyang.android.drinkwaterandstandup.util.CountDownTimerUtil

class FragmentTimerConfigViewModel {
    var navController: NavController? = null

    val helloWorldLiveData: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    init {
        CountDownTimerUtil.startCountDownTimer(helloWorldLiveData, 30)
    }

    fun goToTimerFragment() {
        navController?.navigate(R.id.action_timer_config_to_timer)
    }
}