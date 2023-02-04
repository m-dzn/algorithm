package Baekjoon.math

// 브론즈 II > 상수
fun main() = with(System.`in`.bufferedReader()) {
    val (A, B) = readln().split(' ').map {
        it.reversed().toInt()
    }
    
    val maxNumber = A.coerceAtLeast(B)
    
    println(maxNumber)
}