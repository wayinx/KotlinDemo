package com.example.kotlindemo.others

/**
 * 运算符重载
 */
class Money(val value:Int) {

    //两个对象相加
    operator fun plus(money: Money): Money{
        val sum = value + money.value
        return Money(sum)
    }

    //两个不同对象相加
    operator fun plus(newValue: Int): Money{
        val sum = value + newValue
        return Money(sum)
    }
}