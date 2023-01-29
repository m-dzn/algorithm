package Baekjoon.math.b_simple_think

import java.math.BigDecimal
import java.math.RoundingMode

// 실버 V > 팩토리얼 0의 개수
fun main() = with(System.`in`.bufferedReader()) {
    val N = BigDecimal(readln())
    
    val b1676 = B1676
    
    val calcResult = b1676.factorial(N)
    val answer = b1676.countZeroSuffix(calcResult)
    
    println(answer)
}

object B1676 {
    
    fun factorial(n: BigDecimal): BigDecimal {
        if (n == BigDecimal.ONE || n == BigDecimal.ZERO) return BigDecimal.ONE
        return n.multiply(factorial(n.minus(BigDecimal.ONE)))
    }
    
    fun countZeroSuffix(initNumber: BigDecimal): Int {
        var number = initNumber
        var answer = 0
    
        while (number > BigDecimal.ONE) {
            val (divide, remainder) = number.divideAndRemainder(BigDecimal.TEN)
            if (remainder != BigDecimal.ZERO) break
            
            answer++
            number = divide.setScale(0, RoundingMode.FLOOR)
        }
        
        return answer
    }
}