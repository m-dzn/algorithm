package Baekjoon.implementation.a_grammar

// 브론즈 V > 킹, 퀸, 룩, 비숍, 나이트, 폰
fun main() {
    val totalPieces = arrayOf(1, 1, 2, 2, 2, 8)
    
    val currentPieces = readln().split(' ').map { it.toInt() }
    
    val sb = StringBuilder()
    for (i in currentPieces.indices) {
        sb.append("${totalPieces[i] - currentPieces[i]} ")
    }
    
    println(sb)
}