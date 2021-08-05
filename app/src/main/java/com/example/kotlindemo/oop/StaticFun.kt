package com.example.kotlindemo.oop

class StaticFun {
    fun doAction1() {
        println("do action1")
    }

    companion object {

        /**
         * 静态方法，只Kotlin可调用
         */
        fun doAction2() {
            println("do action2")
        }

        /**
         * 静态方法，Kotlin和Java均可调用
         */
        @JvmStatic
        fun doAction3() {
            println("do action3")
        }

        /**
         * 顶层方法，使用在KotlinFile中，不可包含在任何类中
         * Kotlin可直接调用，Java使用HelperKt.xxx进行调用
         * 此处不做示例
         */
    }
}