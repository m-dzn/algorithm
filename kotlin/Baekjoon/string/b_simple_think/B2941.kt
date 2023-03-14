package Baekjoon.string.b_simple_think

// 실버 V > 크로아티아 알파벳
fun main() {
    val word    = readln()
    
    val croatianAlphabet = arrayOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")
    
    val result = croatianAlphabet.fold(word) { result, cAlphabet ->
        result.replace(cAlphabet, " ")
    }
    
    println(result.length)
}