package Baekjoon.math.a_grammar

// 브론즈 V > Plane
fun main() {
    val (n1, k1, n2, k2) = readln().split(' ').map { it.toInt() }
    val businessSeatCount = n1 * k1
    val economicSeatCount = n2 * k2
    println(businessSeatCount + economicSeatCount)
}