package Baekjoon.sort.a_grammer

// 실버 V > 수 정렬하기 4
fun main() {
    val N = readln().toInt()
    
    val numberList = mutableListOf<Int>()
    
    repeat(N) {
        val number = readln().toInt()
        numberList.add(number)
    }
    
    numberList.sortDescending()
    
    val bw = System.out.bufferedWriter()
    numberList.forEach { bw.appendLine(it.toString()) }
    
    bw.flush()
    bw.close()
}