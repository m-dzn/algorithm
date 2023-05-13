package Baekjoon.math.a_grammar

// 브론즈 IV > 평균 점수
fun main() {
    var sum = 0
    
    repeat(5) { sum += readln().toInt().coerceAtLeast(40) }
    
    println(sum / 5)
}