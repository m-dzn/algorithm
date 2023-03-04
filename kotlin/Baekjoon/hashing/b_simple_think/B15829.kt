package Baekjoon.hashing.b_simple_think

import java.math.BigDecimal

// 브론즈 II > Hashing
fun main() = with(System.`in`.bufferedReader()){
    val EXPONENT = BigDecimal(31)
    val MOD_NUMBER = BigDecimal(1234567891)
    
    val L = readLine().toInt()
    val string = readLine()
    
    fun hash(string: String): BigDecimal {
        var result = BigDecimal.ZERO
        
        repeat(string.length) { i ->
            val chCode = string[i].code - 'a'.code + 1
            result += BigDecimal(chCode).times(EXPONENT.pow(i))
        }
        
        return result.remainder(MOD_NUMBER)
    }
    
    val hashNumber = hash(string)
    
    println(hashNumber)
}