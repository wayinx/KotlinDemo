package com.example.kotlindemo.lambda

import com.example.kotlindemo.oop.Student
import com.example.kotlindemo.oop.Study

fun main() {
    val stu = Student(name = "Tom")
    doStudy(stu)
}

fun doStudy(study: Study?) {
    study?.let {
        it.readBook()
        it.doHomeWork()
    }
}