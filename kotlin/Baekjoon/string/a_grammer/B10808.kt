package Baekjoon.string.a_grammer

// 브론즈 IV > 알파벳 개수
fun main() = with(System.`in`.bufferedReader()) {
    val word = readLine()
    
    val alphabetArray = IntArray(26)
    
    for (ch in word) {
        val index = ch - 'a'
        alphabetArray[index]++
    }
    
    val bw = System.out.bufferedWriter()
    alphabetArray.forEach { bw.append(it.toString()).append(' ') }
    bw.flush()
    
    bw.close()
}