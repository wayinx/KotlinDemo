package com.example.kotlindemo.logic

fun main() {
    for (i in 0..10) {
        println(i)
    }
    println("=========================")

    for (i in 0 until 10) {
        println(i)
    }
    println("=========================")
    for (i in 0 until 10 step 2) {
        println(i)
    }
    println("=========================")
    for (i in 10 downTo 0) {
        println(i)
    }
    println("=========================")
    for (i in 10 downTo 0 step 2) {
        println(i)
    }
}