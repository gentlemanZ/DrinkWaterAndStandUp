package com.tianyang.android.drinkwaterandstandup

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.tianyang.android.drinkwaterandstandup.databinding.ActivityMainBinding
import com.tianyang.android.drinkwaterandstandup.viewModels.MainActivityViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = MainActivityViewModel()
        binding.lifecycleOwner = this
    }
}
