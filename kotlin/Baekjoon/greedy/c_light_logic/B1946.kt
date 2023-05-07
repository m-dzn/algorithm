package Baekjoon.greedy.c_light_logic

import java.lang.StringBuilder

// 실버 I > 신입 사원
fun main() {
    val T = readln().toInt()
    
    val sb = StringBuilder()
    repeat(T) {
        val answer = solution()
        sb.appendLine(answer)
    }
    
    println(sb)
}

private fun solution(): Int {
    /* 입력 : 신입사원 면접 점수 랭킹 배열 */
    val rankList = getNewcomerRankList()
    
    /* 정렬 : 1차 면접 점수 기준 */
    rankList.sortBy { it.first }
    
    /* Greedy : 합격자 수 계산 */
    val passerCount = getPasserCount(rankList)
    
    /* 출력 : 면접 합격자 수 */
    return passerCount
}

private fun getNewcomerRankList(): MutableList<Pair<Int, Int>> {
    val N = readln().toInt()
    val rankList = mutableListOf<Pair<Int, Int>>()
    repeat(N) {
        val interviewRank = readln().split(" ").map { it.toInt() }
        rankList.add(Pair(interviewRank[0], interviewRank[1]))
    }
    
    return rankList
}

private fun getPasserCount(rankList: MutableList<Pair<Int, Int>>) : Int {
    var maxRank = Int.MAX_VALUE
    var passer = 0
    
    rankList.forEachIndexed { index, applicant ->
        if (maxRank > applicant.second) {
            maxRank = applicant.second
            passer++
        }
    }
    
    return passer
}