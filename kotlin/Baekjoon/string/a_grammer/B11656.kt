package Baekjoon.string.a_grammer

// 실버 IV > 접미사 배열
fun main() {
    val S = readln()
    val suffixList = mutableListOf<String>()
    
    for (i in S.indices) {
        val suffix = S.substring(i)
        suffixList.add(suffix)
    }
    
    suffixList.sort()
    
    val bw = System.out.bufferedWriter()
    suffixList.forEach { suffix ->
        bw.write(suffix)
        bw.newLine()
    }
    
    bw.flush()
    bw.close()
}