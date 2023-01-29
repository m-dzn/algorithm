import java.io.*
import java.util.*

// 백준 10950번 A+B - 3
fun main() {
  val reader = BufferedReader(InputStreamReader(System.`in`))

  val repeatTimes = reader.readLine().toInt()
  println(getAdditionList(reader, repeatTimes))

  reader.close()
}

fun add(a: Int, b: Int): Int {
  return a + b
}

fun inputTwoNumbers(reader: BufferedReader): Pair<Int, Int> {
  val tokens = StringTokenizer(reader.readLine())
  val a = tokens.nextToken().toInt()
  val b = tokens.nextToken().toInt()
  return Pair(a, b)
}

fun getAdditionList(reader:BufferedReader, repeatTimes: Int): String {
  val sb = StringBuilder()

  repeat(repeatTimes) {
    val (a, b) = inputTwoNumbers(reader)
    sb.appendLine(add(a, b))
  }

  return sb.toString()
}