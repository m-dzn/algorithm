package Baekjoon.math.a_grammar

// 브론즈 II > A+B - 6
fun main() {
    val T = readln().toInt()
    
    val sb = StringBuilder()
    repeat(T) {
        val (A, B) = readln().split(',').map { it.toInt() }
        sb.appendLine(A + B)
    }
    
    println(sb)
}