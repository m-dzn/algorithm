package Baekjoon.string.a_grammer

// 브론즈 III > 열 개씩 끊어 출력하기
fun main() {
    val line = readln()
    
    val sb = StringBuilder()
    repeat(line.length) { i ->
        val ch = line[i]
        
        sb.append(ch)
        if (i % 10 == 9) sb.appendLine()
    }
    
    println(sb)
}