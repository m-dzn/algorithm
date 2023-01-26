package Baekjoon.dfs

// 실버 III > 1, 2, 3 더하기
fun main() = with(System.`in`.bufferedReader()) {
    val T = readln().toInt()
    val sb = StringBuilder()
    
    repeat(T) {
        val n = readln().toInt()
        
        val dfs = DFS(n)
        dfs.traverseTree(sum = 0)
        
        sb.appendLine(dfs.count)
    }
    
    print(sb)
}

private class DFS(val targetN: Int) {
    var count: Int = 0
    
    fun traverseTree(sum: Int) {
        if (sum > targetN) return
        
        if (sum == targetN) {
            count++
            return
        }
        
        for (num in 1..3) {
            traverseTree(sum = sum + num)
        }
    }
}