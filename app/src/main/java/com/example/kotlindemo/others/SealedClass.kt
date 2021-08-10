package com.example.kotlindemo.others

import android.util.Log

sealed interface SealedClass
data class Const(val number: Double) : SealedClass
data class Sum(val e1: SealedClass, val e2: SealedClass) : SealedClass
object NotANumber : SealedClass

fun eval(expr: SealedClass): Double = when (expr) {
    is Const -> expr.number
    is Sum -> eval(expr.e1) + eval(expr.e2)
    NotANumber -> Double.NaN
}

fun main(args: Array<String>) {
    val const = Const(100.0)
    println(eval(const))
}