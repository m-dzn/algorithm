package Baekjoon.string.a_grammer

import java.lang.StringBuilder

// 브론즈 V > 성택이의 은밀한 비밀번호
fun main() {
    val N  = readln().toInt()
    
    val sb = StringBuilder()
    repeat(N) {
        val password = readln()
        val lengthCheckResult = if (password.length in 6..9) "yes" else "no"
        
        sb.appendLine(lengthCheckResult)
    }
    
    println(sb)
}