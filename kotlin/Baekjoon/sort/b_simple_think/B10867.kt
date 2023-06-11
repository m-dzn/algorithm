package Baekjoon.sort.b_simple_think

// 실버 V > 중복 빼고 정렬하기
fun main() {
    val countingArray = BooleanArray(2 * 1000 + 1)
    
    val N = readln().toInt()
    readln().split(' ').forEach {
        val number = it.toInt()
        countingArray[1000 + number] = true
    }
    
    val sb = StringBuilder()
    countingArray.forEachIndexed { index, flag ->
        if (flag) sb.append(index - 1000).append(' ')
    }
    
    println(sb)
}