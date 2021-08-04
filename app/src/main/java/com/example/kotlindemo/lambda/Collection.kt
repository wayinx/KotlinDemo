package com.example.kotlindemo.lambda

fun main() {
    list()
    mutableList()
    set()
    mutableSet()
    map()
    mutableMap()
    maxLengthFruit()
    apiDemo()
    javaApiDemo()
    println(getTextLength("unbelievable"))
}

fun list() {
    val list = listOf("Apple", "Banana", "Orange", "pear", "Grape")
    for (fruit in list) {
        println(fruit)
    }
    println("=============================")
}

fun mutableList() {
    val list = mutableListOf("Apple", "Banana", "Orange", "pear", "Grape")
    list.add("Watermelon")
    for (fruit in list) {
        println(fruit)
    }
    println("=============================")
}

fun set() {
    val set = setOf("Apple", "Banana", "Orange", "pear", "Grape")
    for (fruit in set) {
        println(fruit)
    }
    println("=============================")
}

fun mutableSet() {
    val set = mutableSetOf("Apple", "Banana", "Orange", "pear", "Grape")
    set.add("Watermelon")
    for (fruit in set) {
        println(fruit)
    }
    println("=============================")
}

fun map() {
    val map = mapOf("Apple" to 1, "Banana" to 2, "Orange" to 3, "Pear" to 4, "Grape" to 5)
    for ((fruit, number) in map) {
        println("fruit is $fruit, number is $number")
    }
    println("=============================")
}

fun mutableMap() {
    val map = mutableMapOf("Apple" to 1, "Banana" to 2, "Orange" to 3, "Pear" to 4, "Grape" to 5)
    map["Watermelon"] = 6
    for ((fruit, number) in map) {
        println("fruit is $fruit, number is $number")
    }
    println("=============================")
}

//最长的水果单词
fun maxLengthFruit() {
    val list = listOf("Apple", "Banana", "Orange", "pear", "Grape")

    //普通写法
    val lambda = { fruit: String -> fruit.length }
    var maxLengthFruit = list.maxByOrNull(lambda)

    //省略lambda变量
    maxLengthFruit = list.maxByOrNull({ fruit: String -> fruit.length })

    //lambda作为最后一个参数时可以提到括号外
    maxLengthFruit = list.maxByOrNull() { fruit: String -> fruit.length }

    //lambda作为唯一参数可省略括号
    maxLengthFruit = list.maxByOrNull { fruit: String -> fruit.length }

    //lambda只有一个参数，用it代替
    maxLengthFruit = list.maxByOrNull { it.length }

    println(maxLengthFruit)
    println("=============================")
}

fun apiDemo() {
    val list = listOf("Apple", "Banana", "Orange", "pear", "Grape")
    var newList = list.map { it.uppercase() }
    for (fruit in newList) {
        println(fruit)
    }
    println("=============================")
    newList = list.filter { it.length >= 5 }
        .map { it.uppercase() }
    for (fruit in newList) {
        println(fruit)
    }
    println("=============================")
    val anyResult = list.any { it.length >= 5 }
    val allResult = list.all { it.length >= 5 }
    println("anyResult is $anyResult, allResult is $allResult")
    println("=============================")
}

fun javaApiDemo() {
    Thread {
        println("=============================")
        println("Thread is running")
        println("=============================")
    }.start()

    //button.setOnClickListener {}
}

fun getTextLength(text: String?) = text?.length ?: 0