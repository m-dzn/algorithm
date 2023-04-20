package Baekjoon.string.a_grammer

// 브론즈 V > 아!
fun main() {
    val expectedAh = readln()
    val actualAh = readln()
    
    val answer = if (expectedAh.length < actualAh.length) "no" else "go"
    
    println(answer)
}