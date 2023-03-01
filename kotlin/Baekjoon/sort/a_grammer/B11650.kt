package Baekjoon.sort.a_grammer

// 실버 V > 좌표 정렬하기
fun main() {
    val N = readln().toInt()
    val points = arrayListOf<Point>()
    
    repeat(N) {
        val (x, y) = readln().split(' ').map { it.toInt() }
        points.add(Point(x, y))
    }
    
    points.sortWith(compareBy({ it.x }, { it.y }))
    
    val sb = StringBuilder()
    points.forEach(sb::appendLine)
    
    println(sb)
}

private data class Point(
    val x: Int,
    val y: Int
) {
    override fun toString(): String {
        return "$x $y"
    }
}