package Baekjoon.sort.b_simple_think

// 브론즈 I > 수 정렬하기 3
/** 카운팅 Sort */
fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    
    val N = br.readLine().toInt()
    val numbers = IntArray(10001)
    repeat(N) {i ->
        val number = br.readLine().toInt()
        numbers[number]++
    }
    
    for (number in 1..10000) {
        bw.write("$number\n".repeat(numbers[number]))
    }
    
    bw.flush()
    bw.close()
    br.close()
}