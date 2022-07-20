import java.io.*

// 백준 11720번 숫자의 합
fun main() {
  val reader = BufferedReader(InputStreamReader(System.`in`))

  reader.readLine()

  val sum = sumStrNumbers(reader.readLine())
  println(sum)
  reader.close()
}

fun sumStrNumbers(line: String): Int {
  return line.toCharArray().fold(0) { acc, char -> acc + (char - '0')}
}