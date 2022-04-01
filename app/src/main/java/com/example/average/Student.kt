package com.example.average

import java.io.Serializable

class Student:Serializable{
    var document: String=""
    var name: String=""
    var age: Int=0
    var phone: String=""
    var adres: String=""
    var note1: String=""
    var note2: String=""
    var note3: String=""
    var note4: String=""
    var note5: String=""

    var number1: Double=0.0
    var number2: Double=0.0
    var number3: Double=0.0
    var number4: Double=0.0
    var number5: Double=0.0

    var average:Double=0.0

    override fun toString(): String {
        return "Student(Document='$document', Name='$name'," +
                " Age=$age, Phone='$phone', Adres='$adres'," +
                " Topic1='$note1', Topic2='$note2', " +
                "Topic3='$note3', Topic4='$note4', Topic5='$note5'," +
                " Note1=$number1, Note2=$number2, Note3=$number3, Note4=$number4, " +
                "Note5=$number5, Average=$average)"
    }
}