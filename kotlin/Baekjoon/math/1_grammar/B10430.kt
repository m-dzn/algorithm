import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

// 백준 10430번 나머지
fun main() {
  val reader = BufferedReader(InputStreamReader(System.`in`))
  val tokens = StringTokenizer(reader.readLine())
  val sb = StringBuilder()

  val A = tokens.nextToken().toInt()
  val B = tokens.nextToken().toInt()
  val C = tokens.nextToken().toInt()

  sb.appendLine((A + B) % C)
  sb.appendLine(((A % C) + (B % C)) % C)
  sb.appendLine((A * B) % C)
  sb.appendLine(((A % C) * (B %C)) % C)

  println(sb)

  reader.close()
}