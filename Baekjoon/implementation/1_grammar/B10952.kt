import java.io.*
import java.util.*

// 백준 10952번 A + B - 5
fun main() {
  val reader = BufferedReader(InputStreamReader(System.`in`))
  val sb = StringBuilder()

  var line = reader.readLine()

  while (line != "0 0") {
    var (a, b) = getTwoNumbers(line)
    sb.appendLine(a + b)
    line = reader.readLine()
  }

  println(sb)
  reader.close()
}

fun getTwoNumbers(line: String): Pair<Int, Int> {
  val tokens = StringTokenizer(line)
  return Pair(getNextNumberFrom(tokens), getNextNumberFrom(tokens))
}

fun getNextNumberFrom(tokens: StringTokenizer): Int {
  return tokens.nextToken().toInt()
}