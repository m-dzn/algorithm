package Baekjoon.bfs

import java.util.LinkedList
import java.util.Queue
import java.util.StringTokenizer

// 골드 III > 아기 상어
fun main() = with(System.`in`.bufferedReader()) {
    /**
     * 입력받은 데이터를 전처리해 반환합니다.
     */
    fun preProcessInputs(): Pair<Array<IntArray>, Point> {
        // Input N :    공간의 크기를 입력받습니다.
        val N =                     readln().toInt()
        
        // Input map :  물고기 지도를 입력받은 후 전처리합니다.
        val map =                   Array(N) { IntArray(N) }
        var babySharkPosition =     Point(row = 0, col = 0)
        repeat(N) { row ->
            val st =    StringTokenizer(readln())
        
            repeat(N) { col ->
                map[row][col] =             st.nextToken().toInt()
            
                if (map[row][col] == 9) {
                    babySharkPosition = Point(row = row, col = col)
                    map[row][col] =         0
                }
            }
        }
        
        return Pair(map, babySharkPosition)
    }
    
    // ① 입력 : 공간의 크기(N)와 물고기 지도(map)를 입력받습니다.
    val (map, babySharkPosition) = preProcessInputs()
    
    // ② 아기 상어 객체 생성
    val babyShark = BabyShark(map = map, position = babySharkPosition)
    
    // ③ 사냥 : 잡아먹을 물고기가 없을 때까지 작은 물고기를 사냥합니다.
    while (babyShark.canHunt) {
        babyShark.huntSmallerFish()
    }
    
    // ④ 출력 : 아기 상어가 사냥을 마칠 때까지 걸린 시간을 출력합니다.
    println(babyShark.timer)
}


private class BabyShark(
    val map:        Array<IntArray>,
    var position:   Point
) {
    var size =      2
    var exp =       0
    var timer =     0
    
    /**
     * 아기 상어의 사냥이 끝날 때마다 사냥할 물고기가 남아있는지 여부가 업데이트됩니다.
     */
    var canHunt = true
        private set
    
    /**
     * 1. 아기 상어의 현재 위치에서 가장 가까운 먹이 후보 물고기 목록을 구합니다.
     * 2. 먹이 후보 물고기가 여러 마리라면 가장 위에 있는 물고기를 먹습니다.
     * 3. 가장 위에 있는 물고기가 여러 마리라면 가장 왼쪽에 있는 물고기를 먹습니다.
     */
    fun huntSmallerFish() {
        val (fishes, distance) = bfs()
        
        if (fishes.isEmpty()) {
            canHunt = false
            return
        }
        
        timer += distance
        val targetFish = selectFish(fishes)
        eatFish(targetFish)
    
//        println("<종료 : ${position}, distance: $distance, timer: $timer>, candidates : $fishes")
    }
    
    /**
     * 여러 마리의 먹이 후보 물고기 중 어떤 물고기를 먹을지 선택합니다.
     * (선택 순서 1. 가장 위의 물고기, 2. 1이 여러 마리면 가장 왼쪽의 물고기)
     */
    private fun selectFish(fishes: List<Point>): Point {
        val minY = fishes.minOf { it.row }
        val topFishes = fishes.filter { it.row == minY }
        val minX = topFishes.minOf { it.col }
        
        return topFishes.first { it.col == minX }
    }
    
    /**
     * 아기 상어가 자기 사이즈만큼 물고기를 먹은 경우 사이즈가 한 단계 더 커집니다.
     */
    private fun sizeUp() {
        if (exp != size) return
        
        exp = 0
        size++
    }
    
    /**
     * 아기 상어가 사냥할 물고기쪽으로 이동해 그 물고기를 잡아먹습니다.
     */
    private fun eatFish(point: Point) {
        position = point
        map[point.row][point.col] = 0
        exp++
        sizeUp()
    }
    
    /**
     * 해당 좌표에 먹을 수 있는 물고기가 있는지 확인합니다.
     */
    private fun isFishEatable(point: Point) =
        map[point.row][point.col] in 1 until this.size
    
    /**
     * 해당 좌표에 큰 물고기가 있는지 확인합니다.
     */
    private fun isFishTooBig(point: Point) =
        map[point.row][point.col] > this.size
    
    /**
     * 가장 가까운 먹이 후보 물고기 목록과 그 거리를 구합니다.
     */
    private fun bfs(): Pair<List<Point>, Int> {
        val que: Queue<Point> = LinkedList()
        val startingPoint = position.copy()
        que.offer(startingPoint)
//        println("\n<${(size - 1) * size / 2 + exp}회차 시작 : $position, size: ${size}, timer: ${timer}> ")
        
        val distanceArray = Array(map.size) { IntArray(map[0].size) }
        val visited = Array(map.size) { BooleanArray(map[0].size) }
        visited[startingPoint.row][startingPoint.col] = true
        
        val nearestEatableFishes = mutableListOf<Point>()
        var minDistance = map.size * map[0].size
        while (que.isNotEmpty()) {
            val currentPoint = que.poll()
            val currentDistance = distanceArray[currentPoint.row][currentPoint.col]
            val nextDistance = currentDistance + 1
    
            if (nextDistance > minDistance) continue        // 더 가까운 물고기가 있는 경우 skip
            
            while (currentPoint.hasNext()) {
                val nextPoint = currentPoint.moveNext(map.size, map[0].size)
                
                if (nextPoint == null || distanceArray[nextPoint.row][nextPoint.col] > 0) continue // 이동 불가 or 방문한 포인트 skip
                
                distanceArray[nextPoint.row][nextPoint.col] = nextDistance
                
                if (isFishTooBig(nextPoint))    continue    // 너무 큰 물고기를 만나면 skip ⭐
    
                if (isFishEatable(nextPoint)) {             // 먹을 수 있는 물고기를 만나면 후보군으로 저장
                    nearestEatableFishes.add(nextPoint.copy())
                    minDistance = nextDistance
                }
                
                que.offer(nextPoint.copy())
//                println("[${nextDistance}칸] $nextPoint -> que: $que, (minD : $minDistance) $nearestEatableFishes")
            }
        }
        
        return Pair(nearestEatableFishes, minDistance)
    }
}

private data class Point(var row: Int, var col: Int) {
    var nextIndex = 0
    
    fun copy(): Point {
        return Point(row = row, col = col)
    }
    
    /**
     * 현재 좌표에서 상하좌우 순서대로 다음으로 이동하며
     * 이동할 상하좌우 좌표가 이동할 수 없는 공간인 경우 null을 반환합니다.
     */
    fun moveNext(rowSize: Int, colSize: Int): Point? {
        val newRow = row + dRow[nextIndex]
        val newCol = col + dCol[nextIndex]
        nextIndex++
        
        if (isValid(row = newRow, col = newCol, rowSize = rowSize, colSize = colSize)) {
            return Point(row = newRow, col = newCol)
        }
        
        return null
    }
    
    /**
     * 현재 좌표의 상하좌우 중 아직 살펴보지 않은 다음 좌표가 있는지 여부를 반환합니다.
     */
    fun hasNext() = nextIndex < 4
    
    companion object {
        val dRow = arrayOf(-1, 1, 0, 0)
        val dCol = arrayOf(0, 0, -1, 1)
    
        /**
         * 이동하려는 좌표가 맵 상에 위치한 정상 좌표인지 여부를 반환합니다.
         */
        fun isValid(row: Int, col: Int, rowSize: Int, colSize: Int) =
            col in 0 until rowSize && row in 0 until colSize
    }
}