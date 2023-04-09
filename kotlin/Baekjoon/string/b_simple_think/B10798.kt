package Baekjoon.string.b_simple_think

import kotlin.math.max

// 브론즈 I > 세로읽기
fun main() {
    var maxLength = 0
    val words = Array(5) {
        val word = readln()
        maxLength = max(maxLength, word.length)
        word
    }
    
    val sb = StringBuilder()
    
    repeat(maxLength) { i ->
        words.forEach { word ->
            if (i < word.length) {
                sb.append(word[i])
            }
        }
    }
    
    println(sb)
}