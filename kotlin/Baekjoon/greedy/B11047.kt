package Baekjoon.greedy

// 실버 IV > 동전 0
fun main() = with(System.`in`.bufferedReader()) {
    val b11047 =        B11047()
    val minCoinCount =  b11047.getMinCoinCount()
    
    println(minCoinCount)
}

class B11047 {
    val N: Int
    val K: Int
    val coins: IntArray
    
    init {
        val (N, K) = readln().split(" ").map { it.toInt() }
        this.N = N
        this.K = K
        
        coins = IntArray(N) { readln().toInt() }
    }
    
    fun getMinCoinCount(): Int {
        var coinCountForK =     0
        var remainder =            this.K
        
        for (coin in coins.reversed()) {
            coinCountForK   +=      remainder / coin
            remainder       %=      coin
        }
        
        return coinCountForK
    }
}