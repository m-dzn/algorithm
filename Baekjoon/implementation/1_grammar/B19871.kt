import java.io.*
import java.util.*

// 백준 10871번 X보다 작은 수
fun main() {
  val reader = BufferedReader(InputStreamReader(System.`in`))
  var tokens = StringTokenizer(reader.readLine())

  val N = getNextNumberFrom(tokens)
  val X = getNextNumberFrom(tokens)

  tokens = StringTokenizer(reader.readLine())
  println(getNumbersMoreThan(X, N, tokens))
  reader.close()
}

fun getNextNumberFrom(tokens: StringTokenizer): Int {
  return tokens.nextToken().toInt()
}

fun getNumbersMoreThan(x: Int, n: Int, tokens: StringTokenizer): String {
  val sb = StringBuilder()

  repeat(n) {
    val num = getNextNumberFrom(tokens)

    if (num < x) {
      sb.append(num).append(' ')
    }
  }

  return sb.toString()
}