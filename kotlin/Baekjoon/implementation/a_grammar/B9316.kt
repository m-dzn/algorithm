package Baekjoon.implementation.a_grammar

import java.lang.StringBuilder

// 브론즈 IV > Hello Judge
fun main() {
    val N = readln().toInt()
    
    val sb = StringBuilder()
    for (i in 1 .. N) {
        sb.appendLine("Hello World, Judge $i!")
    }
    
    println(sb)
}