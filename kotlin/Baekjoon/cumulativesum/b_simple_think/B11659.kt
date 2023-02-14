package Baekjoon.cumulativesum.b_simple_think

import java.util.StringTokenizer

// 실버 III > 구간 합 구하기 4
fun main() = with(System.`in`.bufferedReader()) {
    val (N, M) = readLine().split(' ').map { it.toInt() }
    
    // 가독성을 위해 리스트의 인덱스를 0이 아닌 1부터 사용하기 위한 코드를 추가합니다.
    val cumulativeSum = IntArray(N + 1)
    
    // 누적 합을 계산합니다.
    val st = StringTokenizer(readLine())
    repeat(N) { i ->
        cumulativeSum[i + 1] = cumulativeSum[i] + st.nextToken().toInt()
    }
    
    val sb = StringBuilder()
    
    // 누적 합 리스트를 이용해 효율적으로 구간 합을 계산합니다.
    repeat(M) {
        val (start, end) = readLine().split(' ').map { it.toInt() }
        val sumOfInterval = cumulativeSum[end] - cumulativeSum[start - 1]
        sb.appendLine(sumOfInterval)
    }
    
    println(sb)
}