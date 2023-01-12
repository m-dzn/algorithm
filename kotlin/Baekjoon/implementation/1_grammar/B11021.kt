import java.io.*
import java.util.*

// 백준 11021번 A+B - 7
fun main() {
  val reader = BufferedReader(InputStreamReader(System.`in`))
  val sb = StringBuilder()

  val T = reader.readLine().toInt()

  for(t in 1..T) {
    val (a, b) = getNumbersFrom(reader)
    sb.appendLine("Case #$t: ${add(a, b)}")
  }

  println(sb)
  reader.close()
}

fun getNumbersFrom(reader: BufferedReader): Pair<Int, Int> {
  val tokens = StringTokenizer(reader.readLine())
  return Pair(getNextNumber(tokens), getNextNumber(tokens))
}

fun getNextNumber(tokens: StringTokenizer): Int {
  return tokens.nextToken().toInt()
}

fun add(a: Int, b: Int): Int {
  return a + b
}