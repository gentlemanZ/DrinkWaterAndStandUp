package com.tianyang.android.drinkwaterandstandup.viewModels

import androidx.navigation.NavController
import com.tianyang.android.drinkwaterandstandup.FragmentTimerConfigDirections

class FragmentTimerConfigViewModel {
    var navController: NavController? = null

    fun goToTimerFragment() {
        val timeToCountDownInSecond: Long = 300L
        val action = FragmentTimerConfigDirections.actionTimerConfigToTimer()
        action.timetocountdown = timeToCountDownInSecond
        navController?.navigate(action)
    }
}