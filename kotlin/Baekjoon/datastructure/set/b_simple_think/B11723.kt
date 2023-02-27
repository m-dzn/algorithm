package Baekjoon.datastructure.set.b_simple_think

// 실버 V > 집합
fun main() {
    val M = readln().toInt()
    
    val set = Set()
    
    repeat(M) {
        val command = readln().split(' ')
        
        set.getCommand(command)
    }
    
    set.printResult()
}

private class Set {
    private var set = mutableSetOf<Int>()
    private val sb = StringBuilder()
    
    fun getCommand(command: List<String>) {
        when (command[0]) {
            "add"       -> add(command[1].toInt())
            "remove"    -> remove(command[1].toInt())
            "check"     -> sb.appendLine(check(command[1].toInt()))
            "toggle"    -> toggle(command[1].toInt())
            "all"       -> all()
            "empty"     -> empty()
        }
    }
    
    private fun add(num: Int) {
        set.add(num)
    }
    
    private fun remove(num: Int) {
        set.remove(num)
    }
    
    private fun check(num: Int): Int {
        return  if (set.contains(num))  1
                else                    0
    }
    
    private fun toggle(num: Int) {
        if (set.contains(num))  remove(num)
        else                    add(num)
    }
    
    private fun all() {
        val array = arrayListOf<Int>()
        for (num in 1..20) { array.add(num) }
        
        set = array.toMutableSet()
    }
    
    private fun empty() {
        set.clear()
    }
    
    fun printResult() {
        println(sb)
    }
    
}