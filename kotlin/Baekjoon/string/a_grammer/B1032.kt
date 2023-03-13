package Baekjoon.string.a_grammer

// 브론즈 I > 명령 프롬프트
fun main() {
    val N = readln().toInt()
    
    val fileNames = Array(N) { readln() }
    
    val result = CharArray(fileNames[0].length)
    
    for (i in result.indices) {
        val ch = fileNames[0][i]
        result[i] = ch
        
        for (fileNameIndex in 1 until N) {
            val newCh = fileNames[fileNameIndex][i]
            
            if (ch != newCh) {
                result[i] = '?'
                break
            }
        }
    }
    
    println(String(result))
}