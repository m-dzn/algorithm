package Baekjoon.sort.a_grammer

// 브론즈 II > 수 정렬하기
fun main() {
    val numberLength = readln().toInt()
    val numbers = IntArray(numberLength) { readln().toInt() }
    
    numbers.quickSort()
    
    print(numbers)
}

fun print(numbers: IntArray) {
    val bw = System.out.bufferedWriter()
    numbers.forEach { bw.appendLine(it.toString()) }
    
    bw.flush()
    bw.close()
}

fun IntArray.quickSort() {
    fun getPivot(low: Int, high: Int): Int {
        val index = low + (high - low) / 2
        return this[index]
    }
    
    fun partition(low: Int, high: Int): Int {
        val pivot = getPivot(low, high)
        
        var left = low
        var right = high
        
        while (left <= right) {
            while (this[left] < pivot) left++
            while (pivot < this[right]) right--
    
            if (left <= right) {
                this.swap(left, right)
                left++
                right--
            }
        }
        
        return left
    }
    
    fun sort(low: Int, high: Int) {
        if (high <= low) return                 // 탈출 조건
        
        val mid = partition(low, high)          // 분할
    
        sort(low, mid - 1)                 // 정복 1
        sort(mid, high)                         // 정복 2
    }
    
    sort(0, this.lastIndex)
}

fun IntArray.swap(a: Int, b: Int) {
    val temp = this[a]
    this[a] = this[b]
    this[b] = temp
}