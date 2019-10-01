package com.tianyang.android.drinkwaterandstandup

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), FragmentTimerConfig.OnFragmentInteractionListener,
    FragmentTimer.OnFragmentInteractionListener {
    override fun onFragmentInteraction(uri: Uri) {
        //Do nothing for now.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
    }
}
