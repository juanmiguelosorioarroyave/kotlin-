package com.example.average

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterStudent(val studenList:ArrayList<Student>):RecyclerView.Adapter<AdapterStudent.ViewHolderEstudiante>(){
    class ViewHolderEstudiante(view:View):RecyclerView.ViewHolder(view) {
        var nombre: TextView =view.findViewById(R.id.idNombre)
        var promedio:TextView=view.findViewById(R.id.idPromedio)
        var resultado:TextView=view.findViewById(R.id.idResultado)

        fun asignarDatos(datoEst: Student) {
            nombre.text=datoEst.name
            promedio.text=datoEst.average.toString()

            if (datoEst.average>3.5)
                resultado.text="Win"
            else
                if(datoEst.average>2.5)
                    resultado.text="Recover"
                else
                    resultado.text="Lose"
        }

    }
    override fun onCreateViewHolder(parent: ViewGroup,viewType: Int): AdapterStudent.ViewHolderEstudiante {
        var layoutInflater=LayoutInflater.from(parent.context)
        return ViewHolderEstudiante(layoutInflater.inflate(R.layout.recycle_student,parent,false))
    }
    override fun onBindViewHolder(holder: AdapterStudent.ViewHolderEstudiante, position: Int) {
        holder.asignarDatos(studenList.get(position))
    }

    override fun getItemCount(): Int {
        return studenList.size
    }

}