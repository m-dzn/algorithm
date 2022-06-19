import java.io.*

// 백준 2741번 N 찍기
fun main() {
  val reader = BufferedReader(InputStreamReader(System.`in`))

  val N = reader.readLine().toInt()

  println(getNumbers(N))
  reader.close()
}

fun getNumbers(n: Int): String {
  val sb = StringBuilder()

  for(num in 1..n) {
    sb.appendLine(num)
  }

  return sb.toString()
}