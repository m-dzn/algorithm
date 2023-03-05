package Baekjoon.math.a_grammar

import kotlin.math.roundToInt

// 실버 III > 통계학
fun main() {
    val N = readln().toInt()
    
    val basicStatistics = BasicStatistics(N)
    
    basicStatistics.print()
}

private class BasicStatistics(size: Int) {
    val numbers =           mutableListOf<Int>()
    
    init {
        repeat(size) {
            val number = readln().toInt()
            numbers.add(number)
        }
    }
    
    private fun getAverage(): Int {
        return numbers.average().roundToInt()
    }
    
    private fun getMedian(): Int {
        val sortedList = numbers.sorted()
        val mid = sortedList.size / 2
        
        return sortedList[mid]
    }
    
    private fun getMode(): Int {
        val modeMap = numbers.groupingBy { it }.eachCount()
        val maxRepeat = modeMap.maxOf { it.value }
        
        val maxModeMap = modeMap.filter { it.value == maxRepeat }
        
        val mapKeys = maxModeMap.keys.sorted()
        
        return if (mapKeys.size == 1) mapKeys[0] else mapKeys[1]
    }
    
    private fun getRange(): Int {
        val max = numbers.max()
        val min = numbers.min()
        return max - min
    }
    
    fun print() {
        val sb = StringBuilder()
        sb.appendLine(getAverage())
        sb.appendLine(getMedian())
        sb.appendLine(getMode())
        sb.appendLine(getRange())
        
        println(sb)
    }
}