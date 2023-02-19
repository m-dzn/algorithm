package Baekjoon.greedy.b_simple_think

// 브론즈 II > 거스름돈
fun main() {
    val price = readln().toInt()
    
    val numOfBillAndCoins = JOIGeneralStore.getNumOfBillAndCoinsForChange(price, 1000)
    
    println(numOfBillAndCoins)
}

private object JOIGeneralStore {
    val billAndCoin = arrayOf(500, 100, 50, 10, 5, 1)
    
    fun getNumOfBillAndCoinsForChange(price: Int, payment: Int): Int {
        var change =                payment - price
        var count =                 0
        var indexOfBillAndCoin =    0
        
        while (change > 0) {
            val billOrCoin =        billAndCoin[indexOfBillAndCoin]
            
            if (change < billOrCoin) {
                indexOfBillAndCoin++
            } else {
                change -= billOrCoin
                count++
            }
        }
        
        return count
    }
}