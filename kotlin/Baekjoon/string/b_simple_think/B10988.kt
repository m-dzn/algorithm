package Baekjoon.string.b_simple_think

import java.util.Stack

// 브론즈 II > 팰린드롬인지 확인하기
fun main() {
    val word    = readln()
    
    val answer  = if (isPalindrome(word)) 1 else 0
    println(answer)
}

private fun isPalindrome(word: String): Boolean {
    return word == word.reversed()
}

private fun isPalindrome2(word: String): Boolean {
    var answer  = true
    
    val stack   = Stack<Char>()
    
    // 2: 0, 3: 0, 4: 1, 5: 1, 6: 2
    val pushIndex = word.length / 2 - 1
    
    for (i in 0..pushIndex) {
        stack.push(word[i])
    }
    
    for (i in word.lastIndex - pushIndex..word.lastIndex) {
        val ch = word[i]
        val top = stack.pop()
        
        if (ch != top) {
            answer = false
            break
        }
    }
    
    return answer
}