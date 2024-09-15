import java.util.*

// 실버 IV > 큐
fun main() {
    val N = readln().toInt()
    
    repeat(N) {
        val command = readln().split(' ')
        
        B10845.execute(command)
    }
    
    B10845.print()
}

private object B10845 {
    val sb = StringBuilder()
    val queue: Queue<Int> = LinkedList()
    
    fun execute(command: List<String>) {
        when (command[0]) {
            "push" ->   queue.offer(command[1].toInt())
            "pop" ->    sb.appendLine(pop())
            "size" ->   sb.appendLine(queue.size)
            "empty" ->  sb.appendLine(isEmpty())
            "front" ->  sb.appendLine(front())
            "back" ->   sb.appendLine(back())
        }
    }
    
    fun pop(): Int {
        return if (queue.isNotEmpty()) queue.poll() else -1
    }
    
    fun isEmpty(): Int {
        return if (queue.isEmpty()) 1 else 0
    }
    
    fun front(): Int {
        return if (queue.isNotEmpty()) queue.peek() else -1
    }
    
    fun back(): Int {
        return if (queue.isNotEmpty()) queue.last() else -1
    }
    
    fun print() {
        println(sb)
    }
}