import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

// 백준 10869번 사칙연산
fun main() {
  var reader = BufferedReader(InputStreamReader(System.`in`))
  var tokens = StringTokenizer(reader.readLine())
  var sb = StringBuilder()

  var A = tokens.nextToken().toInt()
  var B = tokens.nextToken().toInt()

  sb.appendLine(A + B)
  sb.appendLine(A - B)
  sb.appendLine(A * B)
  sb.appendLine(A / B)
  sb.appendLine(A % B)

  println(sb)

  reader.close()
}