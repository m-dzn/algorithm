import java.io.*
import java.util.*

// 백준 15552번 빠른 A+B
fun main() {
  val reader = BufferedReader(InputStreamReader(System.`in`))
  val sb = StringBuilder()

  val T = reader.readLine().toInt()

  repeat(T) {
    val (a, b) = getTwoNumbersFromInput(reader)
    sb.appendLine(add(a, b))
  }

  println(sb)
  reader.close()
}

fun getTwoNumbersFromInput(reader: BufferedReader): Pair<Int, Int> {
  val tokens = StringTokenizer(reader.readLine())
  return Pair(getNextNumberFrom(tokens), getNextNumberFrom(tokens))
}

fun getNextNumberFrom(tokens: StringTokenizer): Int {
  return tokens.nextToken().toInt()
}

fun add(a: Int, b: Int): Int {
  return a + b
}