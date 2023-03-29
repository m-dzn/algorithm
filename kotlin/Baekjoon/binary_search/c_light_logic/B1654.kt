package Baekjoon.binary_search.c_light_logic

import java.util.StringTokenizer

// 실버 II > 랜선 자르기
fun main() = with(System.`in`.bufferedReader()) {
    val (numOfCables, numOfCutCables) = getNumberPair()
    val cables = getNetworkCables(numOfCables)
    
    // 1. 자른 후 랜선의 길이가 최대가 되는 값을 구합니다.
    val maxLengthOfCutCable = calcMaxLengthOfCutCable(cables, numOfCutCables)
    
    // 2. 출력
    println(maxLengthOfCutCable)
}

private fun getNumberPair(): Pair<Int, Int> {
    val st = StringTokenizer(readln())
    
    return Pair(st.nextToken().toInt(), st.nextToken().toInt())
}

private fun getNetworkCables(numOfCables: Int): IntArray {
    return IntArray(numOfCables) { readln().toInt() }
}

/**
 * 파라메트릭 서치 (이분 탐색) 를 이용해 자를 랜선 길이 최적화 문제를 해결합니다.
 * @param cables 갖고 있는 랜선들의 길이 값이 담긴 배열
 * @param numOfCutCables 필요한 랜선의 개수
 */
private fun calcMaxLengthOfCutCable(cables: IntArray, numOfCutCables: Int): Int {
    val sortedCables = cables.sorted()
    
    var left    = 1
    var right   = sortedCables.last()
    
    var maxCableLength = 0
    while (left <= right) {
        val mid = right + (left - right) / 2
        var count = 0
        
        sortedCables.forEach { cableLength -> count += cableLength / mid }
        
        if (count >= numOfCutCables) {
            maxCableLength = mid
    
            if (left == Int.MAX_VALUE) break
            left = mid + 1
        } else {
            right = mid - 1
        }
    }
    
    return maxCableLength
}