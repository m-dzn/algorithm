package Baekjoon.math.a_grammar

// 브론즈 V > 가희와 방어율 무시
fun main() {
    val (a, b) = readln().split(' ').map { it.toInt() }
    
    val defence = a * (100 - b) / 100
    val result = if (defence >= 100) 0 else 1
    
    println(result)
}