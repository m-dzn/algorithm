package Baekjoon.sort.b_simple_think

import java.util.*

// 실버 V > 나이순 정렬
fun main() {
    B10814.getInputs()
    
    B10814.sort()
    
    B10814.print()
}

private object B10814 {
    private var peopleList = mutableListOf<Person>()
    
    fun getInputs() {
        val numOfPeople = readln().toInt()
        repeat(numOfPeople) {
            val st = StringTokenizer(readln())
            val age = st.nextToken().toInt()
            val name = st.nextToken()
            
            val newPerson = Person(age, name)
            peopleList.add(newPerson)
        }
    }
    
    fun sort() {
        peopleList.sortBy { it.age }
    }
    
    fun print() {
        val sb = StringBuilder()
        
        peopleList.forEach { sb.appendLine(it.toString()) }
        
        println(sb)
    }
    
    private data class Person(
        val age: Int,
        val name: String
    ) {
        override fun toString(): String = "$age $name"
    }
}