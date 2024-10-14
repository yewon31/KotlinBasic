package com.coding404.kotlinbasic.day03

//추상클래스
//추상변수, 추상메서드 사용할 때 abstract키워드를 씁니다.
//추상클래스는 자식에서 오버라이딩을 강제화 시킬때 사용합니다.
abstract class AbstractEx {

    abstract var a : String //추상변수
    abstract fun some() //추상메서드

    fun some2() {
    }
}

class Child : AbstractEx() {
    override var a: String = "홍길동"

    override fun some() {
        TODO("Not yet implemented")
    }

}