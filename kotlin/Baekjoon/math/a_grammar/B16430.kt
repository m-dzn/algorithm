package Baekjoon.math.a_grammar

// 브론즈 V > 제리와 톰
fun main() {
    val (A, B) = readln().split(' ').map { it.toInt() }
    
    println("${B - A} $B")
}