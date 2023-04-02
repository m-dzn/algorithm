package Baekjoon.binary_search.c_light_logic

import kotlin.math.abs

// 골드 V > 두 용액
fun main() {
    val N = readln().toInt()
    val solutions = readln().split(' ').map { it.toInt() }.toIntArray()
    
    val foundSolutions = getNearestZeroPair(solutions)
    
    println("${foundSolutions.first} ${foundSolutions.second}")
}

private fun getNearestZeroPair(solutions: IntArray): Pair<Int, Int> {
    val sortedSolutions = solutions.sorted()
    
    var minCharacteristicValue = Int.MAX_VALUE
    
    var left = 0
    var right = solutions.lastIndex
    
    val solutionIndexes = arrayOf(0, solutions.lastIndex)
    
    while (left < right) {
        val characteristicValue = sortedSolutions[left] + sortedSolutions[right]
        
        val absoluteValue = abs(characteristicValue)
        
        if (minCharacteristicValue > absoluteValue) {
            minCharacteristicValue = absoluteValue
    
            solutionIndexes[0] = left
            solutionIndexes[1] = right
            
            if (minCharacteristicValue == 0) break
        }
    
        // 값이 정렬돼 있을 때는 합이 음수일 땐 왼쪽, 양수일 땐 오른쪽 포인터를 움직여 0에 가까워질 수 있습니다.
        if (characteristicValue < 0) left++ else right--
    }
    
    val firstSolution = sortedSolutions[solutionIndexes[0]]
    val secondSolution = sortedSolutions[solutionIndexes[1]]
    
    return Pair(firstSolution, secondSolution)
}