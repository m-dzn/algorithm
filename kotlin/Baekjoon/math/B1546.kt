package Baekjoon.math

import java.util.*

// 브론즈 I > 평균
fun main() = with(System.`in`.bufferedReader()) {
    val N = readln().toInt()
    val st = StringTokenizer(readln())
    
    val scores = DoubleArray(N) { st.nextToken().toDouble() }
    
    val max = scores.maxOrNull() ?: 1.0
    val newAvg = scores.map { it / max * 100 }.average()
    
    println(newAvg)
}