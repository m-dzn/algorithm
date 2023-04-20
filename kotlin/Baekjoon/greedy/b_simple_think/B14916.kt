package Baekjoon.greedy.b_simple_think

// 실버 V > 거스름돈
fun main() {
    val n = readln().toInt()
    
    val numOfCoins = getNumOfCoins(n)
    println(numOfCoins)
}

private fun getNumOfCoins(n: Int): Int {
    var remain = n
    var numOfCoins = 0
    
    while (remain > 0) {
        if (remain % 5 == 0) {
            numOfCoins += remain / 5
            break
        } else if (remain % 2 == 0) {
            val coin2 = (remain % 10) / 2
            val coin5 = remain / 10 * 2
            
            numOfCoins += coin2 + coin5
            break
        } else {
            remain -= 5
            numOfCoins++
        }
    }
    
    if (remain < 0) return -1
    
    return numOfCoins
}