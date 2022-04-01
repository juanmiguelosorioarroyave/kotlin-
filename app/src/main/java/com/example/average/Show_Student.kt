package com.example.average

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Show_Student : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.show_student)
        showComponents()

    }
    private fun showComponents(){
        var name:String?=getIntent().getStringExtra("name")
        var phone:String?=getIntent().getStringExtra("phone")
        var adres:String?=getIntent().getStringExtra("adres")
        var document:String?=getIntent().getStringExtra("document")
        var age:String?=getIntent().getStringExtra("age")
        var note1:String?=getIntent().getStringExtra("note1")
        var note2:String?=getIntent().getStringExtra("note2")
        var note3:String?=getIntent().getStringExtra("note3")
        var note4:String?=getIntent().getStringExtra("note4")
        var note5:String?=getIntent().getStringExtra("note5")
        var number1:String?=getIntent().getStringExtra("number1")
        var number2:String?=getIntent().getStringExtra("number2")
        var number3:String?=getIntent().getStringExtra("number3")
        var number4:String?=getIntent().getStringExtra("number4")
        var number5:String?=getIntent().getStringExtra("number5")
        var average:String?=getIntent().getStringExtra("avarage")

        val myTxtN:TextView=findViewById(R.id.Name)
        myTxtN.text="$name"
        val myTxtP:TextView=findViewById(R.id.Phone)
        myTxtP.text="$phone"
        val myTxtA:TextView=findViewById(R.id.Adres)
        myTxtA.text="$adres"
        val myTxtD:TextView=findViewById(R.id.Document)
        myTxtD.text="$document"
        val myTxtAg:TextView=findViewById(R.id.Age)
        myTxtAg.text="$age"
        val myTxtN1:TextView=findViewById(R.id.Topic1)
        myTxtN1.text="$note1"
        val myTxtN2:TextView=findViewById(R.id.Topic2)
        myTxtN2.text="$note2"
        val myTxtN3:TextView=findViewById(R.id.topic3)
        myTxtN3.text="$note3"
        val myTxtN4:TextView=findViewById(R.id.topic4)
        myTxtN4.text="$note4"
        val myTxtN5:TextView=findViewById(R.id.topic5)
        myTxtN5.text="$note5"
        val myTxtNo1:TextView=findViewById(R.id.Note1)
        val myTxtNo2:TextView=findViewById(R.id.Note2)
        val myTxtNo3:TextView=findViewById(R.id.Note3)
        val myTxtNo4:TextView=findViewById(R.id.Note4)
        val myTxtNo5:TextView=findViewById(R.id.Note5)
        val Average:TextView=findViewById(R.id.Avargeshow)
        if (number1 != null) {
            if(number1.toDouble() <= 5 && number1.toDouble() >= 0 ){
                myTxtNo1.text="$number1"
            }else{
                Toast.makeText(this, "the note cannot be greater than 5 and less than 0. Note1", Toast.LENGTH_SHORT).show()
            }
        }
        if (number2 != null) {
            if(number2.toDouble() <= 5 && number2.toDouble() >= 0 ){
                myTxtNo2.text="$number2"
            }else{
                Toast.makeText(this, "the note cannot be greater than 5 and less than. Note2", Toast.LENGTH_SHORT).show()
            }
        }
        if (number3 != null) {
            if(number3.toDouble() <= 5 && number3.toDouble() >= 0 ){
                myTxtNo3.text="$number3"
            }else{
                Toast.makeText(this, "the note cannot be greater than 5 and less than 0. Note 3", Toast.LENGTH_SHORT).show()
            }
        }
        if (number4 != null) {
            if(number4.toDouble() <= 5 && number4.toDouble() >= 0 ){
                myTxtNo4.text="$number4"
            }else{
                Toast.makeText(this, "the note cannot be greater than 5 and less than 0. Note 4", Toast.LENGTH_SHORT).show()
            }
        }
        if (number5 != null) {
            if(number5.toDouble() <= 5 && number5.toDouble() >= 0 ){
                myTxtNo5.text="$number5"
            }else{
                Toast.makeText(this, "the note cannot be greater than 5 and less than 0.Note 5", Toast.LENGTH_SHORT).show()
            }
        }
        if (average != null) {
            if(average.toDouble() <= 5 && average.toDouble() >= 0 ){
                Average.text="$average"
            }else{
                Toast.makeText(this, "The average cannot be displayed as the notes do not add up", Toast.LENGTH_SHORT).show()
            }
        }

        val btnR:Button=findViewById(R.id.Return)
        btnR.setOnClickListener { startComponent() }
    }
    private fun startComponent(){
        startActivity(Intent(this, Register::class.java))
    }
}