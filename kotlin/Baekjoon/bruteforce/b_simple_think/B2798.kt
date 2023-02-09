package Baekjoon.bruteforce.b_simple_think

// 브론즈 2 > 블랙잭
fun main() {
    val (N, M) = readln().split(' ').map { it.toInt() }
    val cards = readln().split(' ').map { it.toInt() }
    
    var maxThreeCardSum = 0
    for (i in cards.indices) {
        for (j in i + 1 until cards.size) {
            for (k in j + 1 until cards.size) {
                val threeCardSum = cards[i] + cards[j] + cards[k]
                
                if (threeCardSum in (maxThreeCardSum + 1).. M) {
                    maxThreeCardSum = threeCardSum
                }
            }
        }
    }
    
    println(maxThreeCardSum)
}