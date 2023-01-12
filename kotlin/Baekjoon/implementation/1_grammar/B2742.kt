import java.io.*

// 백준 2742번 기찍 N
fun main() {
  val reader = BufferedReader(InputStreamReader(System.`in`))

  val N = reader.readLine().toInt()

  println(getNumbers(N))
  reader.close()
}

fun getNumbers(n: Int): String {
  val sb = StringBuilder()

  for(num in n downTo 1) {
    sb.appendLine(num)
  }

  return sb.toString()
}