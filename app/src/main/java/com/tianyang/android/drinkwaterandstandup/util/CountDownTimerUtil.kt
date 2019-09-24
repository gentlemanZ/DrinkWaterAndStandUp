package com.tianyang.android.drinkwaterandstandup.util

import android.arch.lifecycle.MutableLiveData
import android.os.CountDownTimer

object CountDownTimerUtil {
    fun startCountDownTimer(timerLiveData: MutableLiveData<String>) {
        val timer = object : CountDownTimer(300000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                timerLiveData.postValue("hello!$millisUntilFinished")
            }

            override fun onFinish() {
                timerLiveData.postValue("Time's up!")
            }

        }.start()
    }
}