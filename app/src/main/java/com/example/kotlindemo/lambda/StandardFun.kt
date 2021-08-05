package com.example.kotlindemo.lambda

import com.example.kotlindemo.oop.Student
import com.example.kotlindemo.oop.Study
import kotlin.text.StringBuilder

fun main() {
    val stu = Student(name = "Tom")
    doStudy(stu)
    eatFruit()
    eatFruit1()
    eatFruit2()
}

/**
 * let用法
 */
fun doStudy(study: Study?) {
    study?.let {
        it.readBook()
        it.doHomeWork()
    }
}

/**
 * with用法
 */
fun eatFruit() {
    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape")
    val result = with(StringBuilder()) {
        append("With: Start eating fruits.\n")
        for (fruit in list) {
            append(fruit).append("\n")
        }
        append("finished")
        toString()
    }
    println(result)
}

/**
 * run用法
 * 与with不同在于with把调用的对象放在括号内作为参数，而run则是调用对象的run方法
 */
fun eatFruit1() {
    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape")
    val result = StringBuilder().run {
        append("Run: Start eating fruits.\n")
        for (fruit in list) {
            append(fruit).append("\n")
        }
        append("finished")
        toString()
    }
    println(result)
}

/**
 * apply用法
 * 与run不同之处在于，apply函数返回的是调用函数本身，所以result接收的是StringBuilder对象
 */
fun eatFruit2() {
    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape")
    val result = StringBuilder().apply {
        append("Apply: Start eating fruits.\n")
        for (fruit in list) {
            append(fruit).append("\n")
        }
        append("finished")
    }
    println(result.toString())
}