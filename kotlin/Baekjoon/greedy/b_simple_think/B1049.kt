package Baekjoon.greedy.b_simple_think

import kotlin.math.min

// 실버 IV > 기타줄
fun main() {
    val (N, M)                  = readln().split(' ').map { it.toInt() }
    
    var cheapestPackagePrice    = Int.MAX_VALUE
    var cheapestStringPrice     = Int.MAX_VALUE
    
    repeat(M) {
        val (packagePrice, stringPrice) = readln().split(' ').map { it.toInt() }
        
        cheapestPackagePrice    = min(cheapestPackagePrice, packagePrice)
        cheapestStringPrice     = min(cheapestStringPrice, stringPrice)
    }
    
    val minPaymentAmount = B1049.calcMinPaymentAmount(N, cheapestPackagePrice, cheapestStringPrice)
    
    println(minPaymentAmount)
}

object B1049 {
    const val NUMBER_OF_STRING_IN_PACKAGE = 6
    
    fun calcMinPaymentAmount(N: Int, cheapestPackagePrice: Int, cheapestStringPrice: Int): Int {
        val isStringCheaper     = (
            cheapestPackagePrice
                - cheapestStringPrice  * NUMBER_OF_STRING_IN_PACKAGE
                    > 0)
        
        // 이 분기에서는 낱개로 구매하는게 더 저렴합니다.
        if (isStringCheaper)    return cheapestStringPrice * N
        
        // 이 분기에서는 패키지와 낱개의 기타 줄을 섞어서 구매하는게 더 저렴합니다.
        val packagesToBuy       = N / NUMBER_OF_STRING_IN_PACKAGE
        val stringsToBuy        = N % NUMBER_OF_STRING_IN_PACKAGE
        
        var minPaymentAmount = packagesToBuy * cheapestPackagePrice
        
        val stringsPriceOfBuyingIndividually = stringsToBuy * cheapestStringPrice
        
        minPaymentAmount += when (stringsPriceOfBuyingIndividually > cheapestPackagePrice) {
            true    ->  cheapestPackagePrice
            false   ->  stringsPriceOfBuyingIndividually
        }
        
        return minPaymentAmount
    }
}