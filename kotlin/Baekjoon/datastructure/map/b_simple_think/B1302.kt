package Baekjoon.datastructure.map.b_simple_think

import kotlin.math.max

// 실버 IV > 베스트셀러
fun main() {
    val N = readln().toInt()
    
    val bookMap = mutableMapOf<String, Int>()
    
    var maxSalesVolume = 0
    repeat(N) {
        val bookName = readln()
        
        val salesVolume = bookMap.getOrDefault(bookName, 0) + 1
        bookMap[bookName] = salesVolume
        
        maxSalesVolume = max(maxSalesVolume, salesVolume)
    }
    
    val bestSellerList = mutableListOf<String>();
    
    for ((bookName, salesVolume) in bookMap) {
        if (salesVolume != maxSalesVolume) continue
        
        bestSellerList.add(bookName)
    }
    
    bestSellerList.sort()
    
    println(bestSellerList[0])
}