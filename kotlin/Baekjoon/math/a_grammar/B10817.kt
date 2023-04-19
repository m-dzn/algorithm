package Baekjoon.math.a_grammar

// 브론즈 III > 세 수
fun main() {
    val numberList = readln().split(' ').map { it.toInt() }
    
    val secondLargest = numberList.sorted()[1]
    
    println(secondLargest)
}