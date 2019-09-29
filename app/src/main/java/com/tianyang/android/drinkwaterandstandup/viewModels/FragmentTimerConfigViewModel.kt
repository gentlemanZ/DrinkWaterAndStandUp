package com.tianyang.android.drinkwaterandstandup.viewModels

import androidx.navigation.NavController
import com.tianyang.android.drinkwaterandstandup.R

class FragmentTimerConfigViewModel {
    var navController: NavController? = null

    fun goToTimerFragment() {
        navController?.navigate(R.id.action_timer_config_to_timer)
    }
}