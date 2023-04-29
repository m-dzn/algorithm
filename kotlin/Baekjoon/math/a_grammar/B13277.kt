package Baekjoon.math.a_grammar

// 브론즈 V > 큰 수 곱셈
fun main() {
    val (A, B) = readln().split(' ').map { it.toBigDecimal() }
    
    println(A.multiply(B).toPlainString())
}