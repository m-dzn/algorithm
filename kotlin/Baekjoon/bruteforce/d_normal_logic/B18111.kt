package Baekjoon.bruteforce.d_normal_logic

import kotlin.math.abs

// 실버 II > 마인크래프트
fun main() {
    val (rowLength, colLength, blocks) = readln().split(' ').map { it.toInt() }
    val (ground, min, max) = getGroundWithMinMax(rowLength)
    
    // 1. 범위 구하기 : min..max
    val range = min..max
    
    // 2. 브루트포스  : 현재 타겟 높이와 각 좌표 땅 높이 차이를 구해 걸리는 시간 계산
    val (minTimePassed, maxHeight) = getTimePassedAndMaxHeight(ground, range, blocks)
    
    // 3. 경과 시간, 최대 높이 출력
    println("$minTimePassed $maxHeight")
}

private fun getGroundWithMinMax(rowLength: Int): Triple<Array<IntArray>, Int, Int> {
    var min = 256
    var max = 0
    
    val ground = Array(rowLength) {
        readln().split(' ').map {
            val groundHeight = it.toInt()
    
            min = minOf(min, groundHeight)
            max = maxOf(max, groundHeight)
            
            groundHeight
        }.toIntArray()
    }
    
    max = minOf(max, 256)
    
    return Triple(ground, min, max)
}

const val BLOCK_REMOVE_TIME = 2
private fun getTimePassedAndMaxHeight(ground: Array<IntArray>, range: IntRange, blocks: Int): Pair<Int, Int> {
    var minTime     = Int.MAX_VALUE
    var maxHeight   = 0
    
    for (targetHeight in range) {
        var timePassed      = 0
    
        var remainBlocks    = blocks
    
        ground.forEach { rowOfBlocks ->
            rowOfBlocks.forEach { blockHeight ->
                val diff    = abs(blockHeight - targetHeight)
    
                if (blockHeight < targetHeight) {
                    timePassed      += diff
                    remainBlocks    -= diff
                } else {
                    timePassed      += diff * BLOCK_REMOVE_TIME
                    remainBlocks    += diff
                }
            }
        }
        
        if (timePassed <= minTime && remainBlocks >= 0) { // 최소 경과 시간이 같으면 더 높은 높이를 출력
            minTime     = timePassed
            maxHeight   = targetHeight
        }
    }
    
    return Pair(minTime, maxHeight)
}