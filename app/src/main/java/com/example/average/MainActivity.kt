package com.example.average

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.OnClickAction
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {
    var operations: Operations?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        operations= Operations()
        starComponets()
    }
    private val response=registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
        valor->if(valor.resultCode== RESULT_OK){
                val resp=valor?.data?.extras?.get("resultado") as String
                val resp2=valor?.data?.getStringExtra("resultado")
                println("Valor respuesta=$resp y la resps2=$resp2")
                operations= valor?.data?.extras?.get("objetoOperaciones") as Operations?
                operations?.printStudent()
        }
    }
    private fun starComponets(){
        val myBtnR:Button=findViewById(R.id.Register)
        myBtnR.setOnClickListener { onClick(1) }
        val myBtnS:Button=findViewById(R.id.Stadistic)
        myBtnS.setOnClickListener { onClick(2) }
        val myBtnH:Button=findViewById(R.id.Help)
        myBtnH.setOnClickListener { onClick(3) }
    }
    private fun onClick(boton:Int){
        when(boton){
            1->{
                var intents:Intent=Intent(this,Register::class.java)
                var miBundle:Bundle= Bundle()
                miBundle.putSerializable("operaciones",operations)
                miBundle.putString("Nombre","Pepe")
                intents.putExtras(miBundle)
                intents.putExtra("Objeto",operations)
                response.launch(intents)
            }
            2->{
                var miBundle:Bundle= Bundle()
                miBundle.putSerializable("operaciones",operations)
                miBundle.putString("Nombre","Pepe")
                startActivity(Intent(this,Statistics::class.java).putExtra("Objeto",operations).putExtras(miBundle))
            }
            3->{
                startActivity(Intent(this,Help::class.java))
            }
        }
    }
}