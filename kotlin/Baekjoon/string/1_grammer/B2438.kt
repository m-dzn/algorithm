import java.io.*

// 백준 2438번 별 찍기 - 1
fun main() {
  val reader = BufferedReader(InputStreamReader(System.`in`))
  val sb = StringBuilder()

  val N = reader.readLine().toInt()

  for (n in 1..N) {
    repeat(n) {
      sb.append('*')
    }
    sb.appendLine()
  }

  println(sb)
  reader.close()
}