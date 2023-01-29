import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

// 백준 10869번 사칙연산
fun main() {
  val reader = BufferedReader(InputStreamReader(System.`in`))
  val tokens = StringTokenizer(reader.readLine())
  val sb = StringBuilder()

  val A = tokens.nextToken().toInt()
  val B = tokens.nextToken().toInt()

  sb.appendLine(A + B)
  sb.appendLine(A - B)
  sb.appendLine(A * B)
  sb.appendLine(A / B)
  sb.appendLine(A % B)

  println(sb)

  reader.close()
}