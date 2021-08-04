package com.example.kotlindemo.oop

fun main() {
    classAndOriented("Tom", 19)
    inherit("10001", 90, "Jim", 20)
    inter("Jack", 18)
    dataClass()
    singleton()
}

//类与对象示例
fun classAndOriented(name: String, age: Int) {
    val p = Person(name, age)
    p.eat()
}

//继承
fun inherit(sno: String, grade: Int, name: String, age: Int) {
    val s = Student(sno, grade, name, age)
    s.info()
}

//接口
fun inter(name: String, age: Int) {
    val s = Student(name, age)
    val s1 = Student()
    s.doHomeWork()
    s.readBook()
    s1.doHomeWork()
    s1.readBook()
}

//数据类
fun dataClass() {
    val cellphone = Cellphone("xiaomi", 1999)
    val cellphone1 = Cellphone("xiaomi", 1999)
    println(cellphone)
    println("cellphone equals cellphone1 " + (cellphone == cellphone1))
}

//单例类
fun singleton(){
    Singleton.singletonTest()
}