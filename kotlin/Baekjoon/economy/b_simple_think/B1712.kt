package Baekjoon.economy.b_simple_think

// 브론즈 II > 손익분기점
fun main() {
    val (fixedCost, variableCost, price) = readln().split(' ').map { it.toInt() }
    
    val breakEvenPoint = calcBreakEventPoint(fixedCost, variableCost, price)
    
    println(breakEvenPoint)
}

private fun calcBreakEventPoint(fixedCost: Int, variableCost: Int, price: Int): Int {
    if (variableCost >= price) return -1
    
    val diff = price - variableCost
    
    return fixedCost / diff + 1
}