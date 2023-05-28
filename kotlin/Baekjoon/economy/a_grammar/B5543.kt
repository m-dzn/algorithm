package Baekjoon.economy.a_grammar

// 브론즈 IV > 상근날드
fun main() {
    var minBurgerPrice = Int.MAX_VALUE
    var minBeveragePrice = Int.MAX_VALUE
    
    for (i in 1..5) {
        val price = readln().toInt()
        
        if (i <= 3) minBurgerPrice = price.coerceAtMost(minBurgerPrice)
        else minBeveragePrice = price.coerceAtMost(minBeveragePrice)
    }
    
    val minSetPrice = minBurgerPrice + minBeveragePrice - 50
    
    println(minSetPrice)
}