package com.example.kotlindemo.oop

class Student(private val sno: String = "", private val grade: Int = 0, name: String = "", age: Int = 0) :
    Person(name, age), Study {

//    constructor(name: String, age: Int) : this("", 0, name, age)
//
//    constructor() : this("", 0)

    override fun readBook() {
        println("$name is reading.")
    }

    override fun doHomeWork() {
        println("$name is doing homework.")
    }

    fun info() {
        println("$name is studying. Sno is $sno.Grade is $grade,Age is $age.")
    }
}