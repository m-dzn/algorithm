package Baekjoon.dp.b_simple_think

import kotlin.math.max

// 실버 III > 계단 오르기
fun main() {
    val stepScoreList = B2579.getInputs()
    
    val maxScore = B2579.getMaxScore(stepScoreList)
    
    println(maxScore)
}

private object B2579 {
    fun getInputs(): IntArray {
        val numOfSteps = readln().toInt()
        val stepScoreList = IntArray(numOfSteps + 1)
    
        for (i in 1 until stepScoreList.size) {
            val score = readln().toInt()
            stepScoreList[i] = score
        }
        
        return stepScoreList
    }
    
    fun getMaxScore(stepScoreList: IntArray): Int {
        val dp = IntArray(stepScoreList.size)
        
        for (i in 1 until dp.size) {
            when (i) {
                0 -> dp[i] = 0
                1 -> dp[i] = stepScoreList[1]
                2 -> dp[i] = stepScoreList[1] + stepScoreList[2]
                else -> {
                    val scoreJumpedBefore1Step = stepScoreList[i] + dp[i - 2]
                    val scoreJumpedBefore2Step = stepScoreList[i] + stepScoreList[i - 1] + dp[i - 3]
                    dp[i] = max(scoreJumpedBefore1Step, scoreJumpedBefore2Step)
                }
            }
        }
        
        return dp[stepScoreList.size - 1]
    }
}