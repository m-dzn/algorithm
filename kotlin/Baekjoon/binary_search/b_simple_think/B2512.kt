package Baekjoon.binary_search.b_simple_think

import kotlin.math.max

// 실버 III > 예산
fun main() {
    val regionCount = readln().toInt()
    val regionBudget = readln().split(' ').map { it.toInt() }.toIntArray()
    val totalBudget = readln().toInt()
    
    val maxBudgetLimit = getMaxBudgetLimit(regionBudget, totalBudget)

    println(maxBudgetLimit)
}

private fun getMaxBudgetLimit(regionBudget: IntArray, totalBudget: Int): Int {
    val sortedRegionBudget = regionBudget.sorted().toIntArray()
    
    var left = 0
    var right = sortedRegionBudget.last()
    
    var maxBudgetLimit = 0
    
    while (left <= right) {
        val budgetLimit = right + (left - right) / 2
        
        if (isOverBudget(sortedRegionBudget, totalBudget, budgetLimit)) {
            right = budgetLimit - 1
        } else {
            left = budgetLimit + 1
            maxBudgetLimit = max(maxBudgetLimit, budgetLimit)
        }
    }
    
    return maxBudgetLimit
}

private fun isOverBudget(regionBudget: IntArray, totalBudget: Int, budgetLimit: Int): Boolean {
    var sumOfBudgets = 0L
    
    for (budget in regionBudget) {
        sumOfBudgets +=
            if (budget >= budgetLimit)
                budgetLimit
            else
                budget
    }
    
    return sumOfBudgets > totalBudget
}