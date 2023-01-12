import java.io.*
import java.util.*

// 백준 10951번 A+B - 4
fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()
    
    var line: String?
    while ((reader.readLine().also { line = it }) != null) {
        val tokens = StringTokenizer(line)
        val a = getNextNumber(tokens)
        val b = getNextNumber(tokens)
        sb.appendLine(a + b)
    }

    println(sb)
    reader.close()
}

fun getNextNumber(tokens: StringTokenizer): Int {
    return tokens.nextToken().toInt()
}