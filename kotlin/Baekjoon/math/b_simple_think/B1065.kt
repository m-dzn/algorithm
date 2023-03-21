package Baekjoon.math.b_simple_think

// 실버 IV > 한수
fun main() = with(System.`in`.bufferedReader()) {
    val N = readLine().toInt()
    
    val count = (1..N).count { number -> isArithmeticSequenceNumber(number) }
    
    println(count)
}

private fun isArithmeticSequenceNumber(number: Int): Boolean {
    val numberString        = number.toString()
    
    if (numberString.length < 3) return true
    
    val commonDiff          = numberString[0] - numberString[1]
    for (i in 2 until numberString.length) {
        val currentDiff     = numberString[i - 1] - numberString[i]
        
        if (commonDiff != currentDiff) return false
    }
    
    return true
}