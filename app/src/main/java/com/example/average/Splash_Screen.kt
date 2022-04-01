package com.example.average

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.widget.ImageView
import com.bumptech.glide.Glide

class Splash_Screen : AppCompatActivity() {

    val time: Long=3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        supportActionBar?.hide()
        this.window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        Glide.with(this)
        val logo = findViewById<ImageView>(R.id.icon_logo)
        chageActivity()

        logo.animate().apply {
            duration = 1000
            alpha(.5f)
            scaleXBy(.5f)
            scaleYBy(.5f)
            rotationYBy(360f)
            translationYBy(200f)
        }.withEndAction {
            logo.animate().apply {
                duration = 1000
                alpha(1f)
                scaleXBy(-.5f)
                scaleYBy(-.5f)
                rotationXBy(360f)
                translationYBy(-200f)
            }.start()

        }
    }
    private fun chageActivity(){
        Handler().postDelayed(Runnable {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }, time)
    }

}