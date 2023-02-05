package Baekjoon.string.a_grammer

import java.util.StringTokenizer

// 브론즈 II > 단어의 개수
fun main() = with(System.`in`.bufferedReader()) {
    val line = readln()
    val numOfWords = StringTokenizer(line).countTokens()
    
    println(numOfWords)
    close()
}