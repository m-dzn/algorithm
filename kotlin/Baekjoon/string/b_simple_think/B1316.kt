package Baekjoon.string.b_simple_think

// 실버 V > 그룹 단어 체커
fun main() {
    val N = readln().toInt()
    val words = Array(N) { readln() }
    
    val groupWordCount = B1316.getGroupWordCount(words)
    
    println(groupWordCount)
}

private object B1316 {
    fun getGroupWordCount(words: Array<String>): Int =
        words.count { isGroupWord(it) }
    
    fun isGroupWord(word: String): Boolean {
        val alphabet =      BooleanArray(27)
    
        var prevCh: Char =  'a' - 1
        for (ch in word) {
            val currentIndex =          ch + 1 - 'a'
            if (alphabet[currentIndex])  return false
            
            if (ch == prevCh)           continue
    
            val prevChIndex =           prevCh + 1 - 'a'
            alphabet[prevChIndex] =     true
            
            prevCh = ch
        }
        
        return true
    }
}