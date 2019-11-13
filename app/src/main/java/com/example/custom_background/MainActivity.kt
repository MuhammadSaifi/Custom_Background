package com.example.custom_background

import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    // it is same like vecter animation.
    // check xml file .
    // we have added some colors file in drawable see also.
    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val constraintLayout = findViewById<ConstraintLayout>(R.id.layout)
        val animationDrawable = constraintLayout.background as AnimationDrawable
        animationDrawable.setEnterFadeDuration(2000)
        animationDrawable.setExitFadeDuration(4000)
        animationDrawable.start()

    }
}
