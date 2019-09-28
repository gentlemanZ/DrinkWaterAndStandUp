package com.tianyang.android.drinkwaterandstandup

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), FragmentTimeConfig.OnFragmentInteractionListener {
    override fun onFragmentInteraction(uri: Uri) {
        //Do nothing for now.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
//        val binding: ActivityMainBinding =
//            DataBindingUtil.setContentView(this, R.layout.activity_main)
//        binding.viewModel = MainActivityViewModel()
//        binding.lifecycleOwner = this
    }
}
