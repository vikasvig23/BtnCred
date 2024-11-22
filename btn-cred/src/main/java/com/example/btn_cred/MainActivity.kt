package com.example.btn_cred

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.animation.AnimationUtils
import android.widget.Button


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val credButton: Button = findViewById(R.id.credButton)


        val pressAnimation = AnimationUtils.loadAnimation(this, R.anim.button_3d_press)
        val releaseAnimation = AnimationUtils.loadAnimation(this, R.anim.button_release)

        // Set an onClickListener for the button
        credButton.setOnClickListener {
            // Start 3D press animation
            credButton.startAnimation(pressAnimation)

            // Change button color to pink (and keep it after click)
            credButton.setBackgroundColor(resources.getColor(R.color.colorAccent))

            // Wait for animation to finish and then restore normal size
            pressAnimation.setAnimationListener(object : android.view.animation.Animation.AnimationListener {
                override fun onAnimationStart(animation: android.view.animation.Animation?) {}
                override fun onAnimationEnd(animation: android.view.animation.Animation?) {
                    // Change back to normal size after press
                    credButton.startAnimation(releaseAnimation)
                }
                override fun onAnimationRepeat(animation: android.view.animation.Animation?) {}
            })

            // Display message after button click

        }
    }
}
