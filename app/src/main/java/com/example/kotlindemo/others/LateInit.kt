package com.example.kotlindemo.others

class LateInit {
    val name :String = ""
    val age :Int = 0
    lateinit var name1 :String
    //'lateinit' modifier is not allowed on properties of nullable types
    //lateinit var name2 :String?
    //'lateinit' modifier is not allowed on properties of primitive types
    //lateinit var age1 :Int
}