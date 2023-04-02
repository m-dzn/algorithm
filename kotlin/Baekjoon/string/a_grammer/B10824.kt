package Baekjoon.string.a_grammer

// 브론즈 III > 네 수
fun main() {
    val (A, B, C, D) = readln().split(' ')
    
    val first = (A + B).toLong()
    val second = (C + D).toLong()
    
    println(first + second)
}