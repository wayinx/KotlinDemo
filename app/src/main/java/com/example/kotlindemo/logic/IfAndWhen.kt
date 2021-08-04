package com.example.kotlindemo

fun main() {
    println(getScore("Tom") + getScore("Jack"))
    println(getScore1("Tom") + getScore1("Jack"))
    checkNumber(13)
    checkNumber(13.5)
    checkNumber(13L)
}

fun getScore(name: String) = if (name == "Tom") {
    86
} else if (name == "Jack") {
    77
} else if (name == "Rose") {
    87
} else if (name == "Jim") {
    66
} else {
    0
}

fun getScore1(name: String) = when (name) {
    "Tom" -> 86
    "Jack" -> 77
    "Rose" -> 87
    "Jim" -> {66}
    else -> 0
}

fun checkNumber(num:Number){
    when(num){
        is Int-> println("number is Int")
        is Double-> println("number is Double")
        else-> println("number not support")
    }
}