package com.example.average

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Help : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.help)
        val myBtn:Button=findViewById(R.id.btnReturn)
        myBtn.setOnClickListener { returnM() }
    }
    private fun returnM(){
        startActivity(Intent(this,MainActivity::class.java))
    }
}