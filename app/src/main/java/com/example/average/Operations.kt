package com.example.average

import java.io.Serializable

class Operations:Serializable {
    var listStudent: ArrayList<Student> =arrayListOf<Student>()

    fun registerStudent(student: Student){

        listStudent.add(student)
    }

    fun printStudent(){
        for(est in listStudent){
            println(est)
        }
    }

    fun calculateAverage(est: Student): Double {

        var Aver=(est.number1+est.number2+est.number3+est.number4+est.number5)/5

        return Aver
    }
}

