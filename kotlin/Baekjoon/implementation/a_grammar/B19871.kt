import java.util.*

// 백준 10871번 X보다 작은 수
fun main() = with(System.`in`.bufferedReader()) {
  var tokens = StringTokenizer(readln())

  val N = getNextNumberFrom(tokens)
  val X = getNextNumberFrom(tokens)

  tokens = StringTokenizer(readln())
  println(getNumbersMoreThan(X, N, tokens))
  close()
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