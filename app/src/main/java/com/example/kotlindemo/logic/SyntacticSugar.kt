package com.example.kotlindemo

import kotlin.math.max

fun main() {
    val a = 3
    val b = 6
    println("larger number is " + largerNumber00(a, b))
    println("larger number is " + largerNumber01(a, b))
    println("larger number is " + largerNumber02(a, b))
    println("larger number is " + largerNumber10(a, b))
    println("larger number is " + largerNumber11(a, b))
    println("larger number is " + largerNumber12(a, b))
    println("larger number is " + largerNumber13(a, b))
    println("larger number is " + largerNumber14(a, b))
}

fun largerNumber00(num1: Int, num2: Int): Int {
    return max(num1, num2)
}

fun largerNumber01(num1: Int, num2: Int): Int = max(num1, num2)

fun largerNumber02(num1: Int, num2: Int) = max(num1, num2)

fun largerNumber10(num1: Int, num2: Int): Int {
    var num = 0
    if (num1 > num2) {
        num = num1
    } else {
        num = num2
    }
    return num
}

fun largerNumber11(num1: Int, num2: Int): Int {
    var num = 0
    num = if (num1 > num2) {
        num1
    } else {
        num2
    }
    return num
}

fun largerNumber12(num1: Int, num2: Int): Int {
    return if (num1 > num2) {
        num1
    } else {
        num2
    }
}

fun largerNumber13(num1: Int, num2: Int): Int = if (num1 > num2) {
    num1
} else {
    num2
}

fun largerNumber14(num1: Int, num2: Int): Int = if (num1 > num2) num1 else num2
