package Baekjoon.math.a_grammar

import kotlin.math.ceil

// 브론즈 IV > 방학 숙제
fun main() {
    val L = readln().toInt()
    val A = readln().toInt()
    val B = readln().toInt()
    val C = readln().toInt()
    val D = readln().toInt()
    
    val koreanDate = ceil(A / C.toDouble()).toInt()
    val mathDate = ceil(B / D.toDouble()).toInt()
    
    val elapsedDate = (koreanDate).coerceAtLeast(mathDate)
    
    println(L - elapsedDate)
}