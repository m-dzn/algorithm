package Baekjoon.string.b_simple_think

// 실버 III > 문자열 집합
fun main() {
    val (N, M) = readln().split(' ').map { it.toInt() }
    
    val wordSet = mutableSetOf<String>()
    
    repeat(N) { wordSet.add(readln()) }
    
    var count = 0
    repeat(M) {
        val newWord = readln()
        if (wordSet.contains(newWord)) { count++ }
    }
    println(count)
}