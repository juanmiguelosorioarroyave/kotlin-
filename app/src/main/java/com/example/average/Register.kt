package com.example.average

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class Register : AppCompatActivity() {
    var document: EditText? = null
    var name: EditText? = null
    var age: EditText? = null
    var phone: EditText? = null
    var adres: EditText? = null
    var note1: EditText? = null
    var note2: EditText? = null
    var note3: EditText? = null
    var note4: EditText? = null
    var note5: EditText? = null
    var number1: EditText? = null
    var number2: EditText? = null
    var number3: EditText? = null
    var number4: EditText? = null
    var number5: EditText? = null
    var avarage:Double=0.0

    var operations: Operations? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)
        starComponents()
    }

    private fun starComponents() {
        var bundle: Bundle? =this.intent.extras
        operations= bundle?.getSerializable("operaciones") as Operations?
        document = findViewById(R.id.Document)
        name = findViewById(R.id.Name)
        age = findViewById(R.id.Age)
        phone = findViewById(R.id.Phone)
        adres = findViewById(R.id.Adres)
        note1 = findViewById(R.id.Note)
        note2 = findViewById(R.id.Note2)
        note3 = findViewById(R.id.Note3)
        note4 = findViewById(R.id.Note4)
        note5 = findViewById(R.id.Note5)
        number1 = findViewById(R.id.Number1)
        number2 = findViewById(R.id.Number2)
        number3 = findViewById(R.id.Number3)
        number4 = findViewById(R.id.Number4)
        number5 = findViewById(R.id.Number5)
        val btnR: Button = findViewById(R.id.Registers)
        btnR.setOnClickListener { registerStudent()}

    }

    private fun registerStudent() {
        val est: Student = Student()
        est.document = document?.text.toString()
        est.name = name?.text.toString()
        est.age = age?.text.toString().toInt()
        est.adres = adres?.text.toString()
        est.phone = phone?.text.toString()
        est.note1=note1?.text.toString()
        est.note2=note2?.text.toString()
        est.note3=note3?.text.toString()
        est.note4=note4?.text.toString()
        est.note5=note5?.text.toString()

        est.number1= number1?.text.toString().toDouble()
        est.number2= number2?.text.toString().toDouble()
        est.number3= number3?.text.toString().toDouble()
        est.number4= number4?.text.toString().toDouble()
        est.number5= number5?.text.toString().toDouble()

        est.average= operations!!.calculateAverage(est)
        avarage=operations!!.calculateAverage(est)
        operations?.registerStudent(est)
        operations?.printStudent()
        returnData()
    }
    override fun onKeyDown(keyCode: Int, event:KeyEvent?): Boolean {
        if (keyCode==KeyEvent.KEYCODE_BACK){
            Toast.makeText(this, "Close Activity", Toast.LENGTH_SHORT).show()
            returnData()
            finish()
        }
        return super.onKeyDown(keyCode, event)
    }
    private fun returnData(){
        var miIntent: Intent = Intent(this,MainActivity::class.java)
        miIntent.putExtra("resultado","Registro exitoso")
        var miBundle:Bundle= Bundle()
        miBundle.putSerializable("objetoOperaciones",operations)
        miIntent.putExtras(miBundle)
        miIntent.putExtra("obj",operations)
        setResult(RESULT_OK,miIntent)
    }
    private fun showData(){
        startActivity(Intent(this,Show_Student::class.java)
            .putExtra("name",name?.text.toString())
            .putExtra("document",document?.text.toString())
            .putExtra("phone",phone?.text.toString())
            .putExtra("adres",adres?.text.toString())
            .putExtra("age",age?.text.toString())
            .putExtra("note1",note1?.text.toString())
            .putExtra("note2",note2?.text.toString())
            .putExtra("note3",note3?.text.toString())
            .putExtra("note4",note4?.text.toString())
            .putExtra("note5",note5?.text.toString())
            .putExtra("number1",number1?.text.toString())
            .putExtra("number2",number2?.text.toString())
            .putExtra("number3",number3?.text.toString())
            .putExtra("number4",number4?.text.toString())
            .putExtra("number5",number5?.text.toString())
            .putExtra("avarage",avarage.toString()))
    }
}