package Baekjoon.math.a_grammar

import java.math.BigDecimal

// 브론즈 V > 큰 수 A+B
fun main() = with(System.`in`.bufferedReader()) {
    val (A, B) = readln().split(' ').map { BigDecimal(it) }
    
    println(A.plus(B))
}