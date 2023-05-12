package Baekjoon.economy.a_grammar

// 브론즈 V > 세금
fun main() {
    val N = readln().toBigDecimal()
    
    val prize1 = N.multiply(0.78.toBigDecimal()).toInt()
    val prize2 = (N.multiply(0.8.toBigDecimal()) + N.multiply(0.2.toBigDecimal()).multiply(0.78.toBigDecimal())).toInt()
    
    println("$prize1 $prize2")
}