package Baekjoon.binary_search.b_simple_think

import java.util.StringTokenizer

// 실버 V > 숫자 카드
fun main() = with(System.`in`.bufferedReader()) {
    val N                   = readLine().toInt()
    val cards               = B10815.getNumbers(readLine(), N)
    
    cards.sort()
    
    val M                   = readLine().toInt()
    val numbers             = B10815.getNumbers(readLine(), M)
    
    val bw                  = System.out.bufferedWriter()
    for (number in numbers) {
        val result          = B10815.binarySearch(cards, number)
        bw.write(result.toString())
        bw.write(" ")
    }
    
    bw.flush()
    bw.close()
}

private object B10815 {
    fun getNumbers(line: String, length: Int): IntArray {
        val st = StringTokenizer(line)
        val cards = IntArray(length)
        
        for (i in cards.indices) {
            val card = st.nextToken().toInt()
            cards[i] = card
        }
        
        return cards
    }
    
    /**
     * 정렬돼 있는 카드를 이분 탐색해 target이 카드 목록에 있는지 확인합니다.
     */
    fun binarySearch(cards: IntArray, target: Int): Int {
        var left            = 0
        var right           = cards.lastIndex
        
        while (left <= right) {
            val index       = right - (right - left) / 2
            val card        = cards[index]
            
            if      (target == card)    return 1
            else if (card < target)     left    = index + 1
            else                        right   = index - 1
        }
        
        return 0
    }
}