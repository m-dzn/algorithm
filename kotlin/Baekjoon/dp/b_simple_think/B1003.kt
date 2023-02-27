package Baekjoon.dp.b_simple_think

import java.lang.StringBuilder

// 실버 III > 피보나치 함수
fun main() {
    val T = readln().toInt()
    
    B1003.initDP()
    
    val sb = StringBuilder()
    repeat(T) {
        val N = readln().toInt()
        
        val printCount = B1003.getPrintCountOfZeroAndOne(N)
        sb.appendLine(printCount)
    }
    
    println(sb)
}

private object B1003 {
    val dp = ArrayList<Pair<Int, Int>>()
    
    fun initDP() {
        dp.add(Pair(1, 0))
        dp.add(Pair(0, 1))
        
        for(i in 2..40) {
            val newZeroCount = dp[i - 1].first + dp[i - 2].first
            val newOneCount = dp[i - 1].second + dp[i - 2].second
            
            dp.add(Pair(newZeroCount, newOneCount))
        }
    }
    
    fun getPrintCountOfZeroAndOne(n: Int): String {
        val (zeroCount, oneCount)= dp[n]
        return "$zeroCount $oneCount"
    }
}