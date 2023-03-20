package Baekjoon.math.c_light_logic

import kotlin.math.sqrt

// 실버 V > 소수
fun main() = with(System.`in`.bufferedReader()) {
    val M = readLine().toInt()
    val N = readLine().toInt()
    
    val allPrimes       = generatePrimes(N)
    val primesInRange   = allPrimes.filter { it in M..N }
    
    val bw = System.out.bufferedWriter()
    if (primesInRange.isNotEmpty()) {
        bw.appendLine(primesInRange.sum().toString())
        bw.appendLine(primesInRange.min().toString())
    } else {
        bw.appendLine("-1")
    }
    
    bw.flush()
    bw.close()
}

private fun isPrime(num: Int, primes: List<Int>): Boolean {
    for (prime in primes) {
        if (prime > sqrt(num.toDouble()).toInt()) break
        if (num % prime == 0) return false
    }
    
    return true
}

private fun generatePrimes(limit: Int): List<Int> {
    val primes = mutableListOf(2)
    
    for (num in 3..limit) {
        if (isPrime(num, primes)) {
            primes.add(num)
        }
    }
    
    return primes
}