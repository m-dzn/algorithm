package Baekjoon.math.a_grammar

// 브론즈 V > 긴자리 계산
fun main() {
    val A = readln().toBigDecimal()
    val B = readln().toBigDecimal()
    
    val sb = StringBuilder()
    
    sb.appendLine(A.add(B))
    sb.appendLine(A.minus(B))
    sb.appendLine(A.multiply(B))
    
    println(sb)
}