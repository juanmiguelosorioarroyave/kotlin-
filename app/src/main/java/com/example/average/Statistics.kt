package com.example.average

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Statistics : AppCompatActivity() {
    var operations: Operations?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.statistics)
        var bundle: Bundle? =this.intent.extras
        operations= bundle?.getSerializable("operaciones") as Operations?
        var recycler=findViewById<RecyclerView>(R.id.recyclerEstudiantes)
        recycler.adapter=AdapterStudent(operations!!.listStudent)
        recycler.layoutManager=LinearLayoutManager(this)
        operations?.printStudent()
    }
}