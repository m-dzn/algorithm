package Baekjoon.dp

// 실버 III > 2xn 타일링 2
fun main() = with(System.`in`.bufferedReader()) {
    val n = readln().toInt()
    
    val dp = IntArray(n + 1)
    dp[1] = 1
    
    if (n >= 2) dp[2] = 3
    
    for (i in 3..n) {
        dp[i] = (dp[i - 1] + dp[i - 2] * 2) % 10007
    }
    
    println(dp[n])
}