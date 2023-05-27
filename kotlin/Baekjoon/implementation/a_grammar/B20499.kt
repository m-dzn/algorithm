package Baekjoon.implementation.a_grammar

// 브론즈 IV > Darius님 한타 안 함?
fun main() {
    val (K, D, A) = readln().split('/').map { it.toInt() }
    
    var result = "gosu"
    
    if (K + A < D || D == 0) result = "hasu"
    
    println(result)
}