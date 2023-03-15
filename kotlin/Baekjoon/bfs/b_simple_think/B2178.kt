package Baekjoon.bfs.b_simple_think

import java.util.*

// 실버 I > 미로 탐색
fun main() = with(System.`in`.bufferedReader()) {
    val (N, M) = readLine().split(' ').map { it.toInt() }
    val maze = Array(N) { readLine().toCharArray() }
    
    val a = bfs(maze, N, M)
    
    println(a)
}

private fun bfs(maze: Array<CharArray>, N: Int, M: Int): Int {
    val queue: Queue<Point> = LinkedList()
    queue.offer(Point(0, 0))
    
    val visited = Array(N) { BooleanArray(M) }
    var depth = 0
    
    while (queue.isNotEmpty()) {
        depth++
        
        repeat(queue.size) {
            val current = queue.poll()
    
            if (current.x == N - 1 && current.y == M - 1) return depth
    
            for (i in Point.dx.indices) {
                val nx = current.getNx(i)
                val ny = current.getNy(i)
        
                if (nx < 0 || N <= nx) continue
                if (ny < 0 || M <= ny) continue
        
                if (visited[nx][ny]) continue
                if (maze[nx][ny] == '0') continue
        
                queue.offer(Point(nx, ny))
                visited[nx][ny] = true
            }
        }
    }
    
    return 0
}

private data class Point(val x: Int, val y: Int) {
    companion object {
        val dx = arrayOf(0, 0, -1, 1)
        val dy = arrayOf(-1, 1, 0, 0)
    }
    
    fun getNx(i: Int) = x + dx[i]
    fun getNy(i: Int) = y + dy[i]
}