package Baekjoon.implementation.a_grammar

// 브론즈 V > 코딩은 체육과목 입니다
fun main() {
    val N = readln().toInt()
    
    val repeatOfLong = N / 4
    
    val answer = "long ".repeat(repeatOfLong) + "int"
    println(answer)
}