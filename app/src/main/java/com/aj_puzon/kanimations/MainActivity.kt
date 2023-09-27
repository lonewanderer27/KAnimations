package com.aj_puzon.kanimations

import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    fun clockwise() {
        val image = findViewById<View>(R.id.animImage) as ImageView
        val animation = AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.clockwise
        )
        image.startAnimation(animation)
    }

    fun zoom() {
        Log.i("animation: ", "zoom")
        val image = findViewById<View>(R.id.animImage) as ImageView
        val animation = AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.zoom
        )
        image.startAnimation(animation)
    }

    fun fade() {
        val image = findViewById<View>(R.id.animImage) as ImageView
        val animation = AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.fade
        )
        image.startAnimation(animation)
    }

    fun blink() {
        val image = findViewById<View>(R.id.animImage) as ImageView
        val animation = AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.blink
        )
        image.startAnimation(animation)
    }

    fun move() {
        val image = findViewById<View>(R.id.animImage) as ImageView
        val animation = AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.move
        )
        image.startAnimation(animation)
    }

    fun slide() {
        val image = findViewById<View>(R.id.animImage) as ImageView
        val animation = AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.slide
        )
        image.startAnimation(animation)
    }

    fun resetAnimation() {
        val image = findViewById<View>(R.id.animImage) as ImageView
        image.clearAnimation()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttons = arrayOf(
            findViewById(R.id.clockwise),
            findViewById(R.id.zoom2),
            findViewById(R.id.fade),
            findViewById(R.id.blink),
            findViewById(R.id.move),
            findViewById<Button>(R.id.slide)
        )

        for (i in buttons.indices) {
            buttons[i].setOnClickListener { view: View? ->
                resetAnimation()
                try {
                    when (i) {
                        0 -> clockwise()
                        1 -> zoom()
                        2 -> fade()
                        3 -> blink()
                        4 -> move()
                        5 -> slide()
                    }
                } catch (e: Exception) {
                    println(e)
                }
            }
        }
    }
}