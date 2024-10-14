package com.coding404.kotlinbasic.day02

class ConstructEx02 {
    var name : String? = null
    var age : Int? = null

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age

    }
    constructor(name: String) : this(name, 1) {
        //this(name, 1) 가 없습니다
//        this.name = name
//        this.age = 1
    }
}

fun main() {
    val a = ConstructEx02("홍길동")
    println("${a.name}, ${a.age}")
}