package Baekjoon.math.a_grammar

// 브론즈 IV > R2
fun main() {
    val (R1, S) = readln().split(' ').map { it.toInt() }
    
    println(2 * S - R1)
}