package Baekjoon.binary_search.c_light_logic

import java.util.StringTokenizer
import kotlin.math.max

// 실버 II > 나무 자르기
fun main() = with(System.`in`.bufferedReader()) {
    val (N, M) = readLine().split(' ').map { it.toInt() }
    val trees = IntArray(N)
    
    var maxHeight = 0
    val st = StringTokenizer(readLine())
    for (i in trees.indices) {
        val height = st.nextToken().toInt()
        
        trees[i] = height
        
        maxHeight = max(maxHeight, height)
    }
    
    val targetHeight = B2805.binarySearch(M, maxHeight, trees)
    
    println(targetHeight)
}

private object B2805 {
    fun binarySearch(M: Int, defaultMaxHeight: Int, trees: IntArray): Int {
        var maxHeight = defaultMaxHeight
        var middleHeight = 0
        var minHeight = 1
        
        var sum: Long
    
        while (maxHeight >= minHeight) {
            sum = 0
            
            trees.forEach { treeHeight ->
                if (treeHeight >= middleHeight) sum += treeHeight - middleHeight
            }
            
            // 1/2씩 범위를 좁히는 nlogn의 이분 탐색을 실시합니다.
            if (sum >= M)   minHeight = middleHeight + 1
            else            maxHeight = middleHeight - 1
            
            middleHeight =  maxHeight - (maxHeight - minHeight) / 2
        }
        
        return middleHeight
    }
}