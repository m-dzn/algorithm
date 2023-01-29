package Baekjoon.math.a_grammar

// 브론즈 V > 검증수
fun main() = with(System.`in`.bufferedReader()) {
    val sumOfSquares = readln().split(' ').map { it.toInt() }.fold(0) { total, num ->
        total + num * num
    }
    
    val verificationNumber = sumOfSquares % 10
    
    println(verificationNumber)
}