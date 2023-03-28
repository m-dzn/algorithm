package Baekjoon.datastructure.stack.b_simple_think

import java.util.Stack

// 실버 IV > 균형잡힌 세상
fun main() {
    val sb = StringBuilder()
    
    while (true) {
        val line = readln()
    
        // 1. 종료 조건 :       line == "."이 될 때까지 테스트 케이스를 반복 입력받습니다.
        if (line == ".") break
    
        // 2. 비즈니스 로직 :    입력받은 값이 균형이 잡혀있는지 검사 후 출력 대기열에 추가합니다.
        sb.appendLine(if (isBalanced(line)) "yes" else "no")
    }
    
    // 3. 출력
    println(sb)
}

private fun isBalanced(line: String): Boolean {
    val bracketStack = Stack<Char>()
    
    for (ch in line) {
        when (ch) {
            '(' -> bracketStack.push(ch)
            ')' -> {
                if (bracketStack.isEmpty() || bracketStack.peek() != '(') return false
    
                bracketStack.pop()
            }
            '[' -> bracketStack.push(ch)
            ']' ->  {
                if (bracketStack.isEmpty() || bracketStack.peek() != '[') return false
    
                bracketStack.pop()
            }
        }
    }
    
    if (bracketStack.isNotEmpty()) return false
    
    return true
}
