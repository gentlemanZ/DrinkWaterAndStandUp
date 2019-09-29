package com.tianyang.android.drinkwaterandstandup.util

import android.os.CountDownTimer
import androidx.lifecycle.MutableLiveData
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit

object CountDownTimerUtil {
    val formatter: DateFormat = SimpleDateFormat("HH:mm:ss", Locale.US)

    init {
        formatter.timeZone = TimeZone.getTimeZone("UTC")
    }

    fun startCountDownTimer(
        timerLiveData: MutableLiveData<String>,
        secondLeftOnCountDownTimer: Long
    ) {
        object : CountDownTimer(
            TimeUnit.SECONDS.toMillis(secondLeftOnCountDownTimer),
            TimeUnit.SECONDS.toMillis(1L)
        ) {
            override fun onTick(millisUntilFinished: Long) {
                val textContent: String = formatter.format(Date(millisUntilFinished))
                timerLiveData.postValue(textContent)
            }

            override fun onFinish() {
                timerLiveData.postValue("Time's up!")
            }

        }.start()
    }
}