package Baekjoon.string.a_grammer

// 문자와 문자열
fun main() {
    val word = readln()
    val position = readln().toInt()
    
    println(word[position - 1])
}