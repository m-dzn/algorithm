package Baekjoon.dfs

// 골드 V > 적록색약
fun main() = with(System.`in`.bufferedReader()) {
    val b10026 = B10026
    b10026.inputColorMap()
    b10026.countAreas()
    
    println("${b10026.countForNormal} ${b10026.countForColorWeak}")
}

object B10026 {
    val N: Int = readln().toInt()
    private val normalColorMap = Array(N) { CharArray(N) }
    private val colorWeakColorMap = Array(N) { CharArray(N) }
    private val visitedForNormal: Array<BooleanArray> = Array(N) { BooleanArray(N) }
    private val visitedForColorWeak: Array<BooleanArray> = Array(N) { BooleanArray(N) }
    
    var countForNormal: Int = 0
    var countForColorWeak: Int = 0
    
    fun inputColorMap() {
        repeat(N) {x ->
            val line = readln()
            repeat(N) { y ->
                normalColorMap[x][y] = line[y]
                colorWeakColorMap[x][y] = if (line[y] == 'R') 'G' else line[y]
            }
        }
    }
    
    fun dfs(x: Int, y: Int, map: Array<CharArray>, visited: Array<BooleanArray>): Boolean {
        if (visited[x][y]) return false
        
        val point = Point(x, y, map)
        val color = point.getPointValue()
        visited[x][y] = true
        
        while (point.hasNext()) {
            val nextPoint = point.nextPoint() ?: continue
            
            val nextColor = nextPoint.getPointValue()
            if (color != nextColor) continue
            
            dfs(
                x = nextPoint.x,
                y = nextPoint.y,
                map = map,
                visited = visited
            )
        }
        
        return true
    }
    
    fun countAreas() {
        countForNormal = 0
        countForColorWeak = 0
        
        repeat(N) { x -> repeat(N) { y ->
            if (dfs(x, y, normalColorMap, visitedForNormal)) countForNormal++
            if (dfs(x, y, colorWeakColorMap, visitedForColorWeak)) countForColorWeak++
        } }
    }
}

private class Point(val x: Int, val y: Int, val map: Array<CharArray>) {
    private var position: Int = 0
    
    companion object {
        // 12시부터 시계방향(상우하좌)으로 탐색합니다.
        val dx = arrayOf(0, 1, 0, -1)
        val dy = arrayOf(-1, 0, 1, 0)
    }
    
    fun getPointValue(): Char {
        return map[x][y]
    }
    
    fun nextPoint(): Point? {
        if (position >= dx.size) return null
        
        val nextX = x + dx[position]
        val nextY = y + dy[position]
        
        position++
        // 탐색 시 유효하지 않은 좌표를 만나면 재탐색합니다.
        if (nextX < 0 || map.size <= nextX || nextY < 0 || map[0].size <= nextY) {
            return nextPoint()
        }
        
        return Point(nextX, nextY, map)
    }
    
    fun hasNext(): Boolean {
        return position < dx.size
    }
}