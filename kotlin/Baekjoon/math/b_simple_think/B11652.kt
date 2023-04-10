package Baekjoon.math.b_simple_think

import kotlin.math.min

// 실버 IV > 카드
fun main() {
    val N = readln().toInt()
    val cardMap = mutableMapOf<Long, Int>()
    
    val maxCard = getMaxCard(N, cardMap)
    
    println(maxCard)
}

private fun getMaxCard(repeatNumber: Int, cardMap: MutableMap<Long, Int>): Long {
    var maxCard = 0L
    var maxCount = 0
    
    for (i in 1..repeatNumber) {
        val card = readln().toLong()
        
        val newCount = incrementCardCount(card, cardMap)
        
        if (maxCount > newCount) continue
        
        maxCard = if (maxCount == newCount)     `get card with same frequent card policy`(card, maxCard)
                  else                          card
        maxCount = newCount
    }
    
    return maxCard
}

private fun incrementCardCount(pickedCard: Long, cardMap: MutableMap<Long, Int>): Int {
    val newCount = cardMap.getOrDefault(pickedCard, 0) + 1
    cardMap[pickedCard] = newCount
    
    return newCount
}

private fun `get card with same frequent card policy`(card: Long, maxCard: Long): Long {
    return min(maxCard, card)
}