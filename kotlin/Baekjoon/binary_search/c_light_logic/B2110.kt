package Baekjoon.binary_search.c_light_logic

import java.io.BufferedReader
import java.util.*
import kotlin.math.max

// 골드 IV > 공유기 설치
fun main() = with(System.`in`.bufferedReader()){
    val (houseCount, routerCount) = getIntPair(this)
    val houseCoords = getHouseCoords(this, houseCount)
    
    // 1. 가장 인접한 두 공유기 사이의 거리가 최대가 되는 값을 구한다.
    val maxDistance = getRouterMaxDistance(routerCount, houseCoords)
    
    // 2. 출력
    println(maxDistance)
}

private fun getIntPair(br: BufferedReader): Pair<Int, Int> {
    val st = StringTokenizer(br.readLine())
    
    return Pair(st.nextToken().toInt(), st.nextToken().toInt())
}

private fun getHouseCoords(br: BufferedReader, houseCount: Int): IntArray {
    return IntArray(houseCount) { br.readLine().toInt() }
}

private fun getRouterMaxDistance(routerCount: Int, houseCoords: IntArray): Int {
    val sortedHouseCoords = houseCoords.sorted()
    
    var maxRouterDistance = 0
    
    var left    = 1
    var right   = sortedHouseCoords.last() - sortedHouseCoords.first()
    
    while (left <= right) {
        val targetDistance          = right + (left - right) / 2
        
        if (canInstallRouters(routerCount, targetDistance, sortedHouseCoords)) {
            maxRouterDistance       = max(maxRouterDistance, targetDistance)
            
            left    = targetDistance + 1
        } else {
            right   = targetDistance - 1
        }
    }
    
    return maxRouterDistance
}

private fun canInstallRouters(routerCount: Int, targetDistance: Int, sortedHouseCoords: List<Int>): Boolean {
    var routerCandidateCount   = 1
    
    var prevCoord = sortedHouseCoords[0]
    
    for (i in 1 until sortedHouseCoords.size) {
        val currentCoord        = sortedHouseCoords[i]
        val distance            = currentCoord - prevCoord
        
        if (distance >= targetDistance)     {
            routerCandidateCount++
            prevCoord = currentCoord // 후보로 추가됐을 때만 prevCoord로 간주
        }
        if (routerCandidateCount >= routerCount) return true
    }
    
    return false
}