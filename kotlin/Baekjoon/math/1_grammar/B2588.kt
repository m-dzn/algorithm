import java.io.BufferedReader
import java.io.InputStreamReader

// 백준 2588번 곱셈
fun main() {
  val reader = BufferedReader(InputStreamReader(System.`in`))
  val sb = StringBuilder()

  val A = reader.readLine().toInt()
  val B = reader.readLine()

  val digit100 = A * parseInt(B[0])
  val digit10 = A * parseInt(B[1])
  val digit1 = A * parseInt(B[2])

  sb.appendLine(digit1)
  sb.appendLine(digit10)
  sb.appendLine(digit100)
  sb.appendLine(A * B.toInt())

  println(sb)

  reader.close()
}

fun parseInt(value: Char): Int {
  return Character.getNumericValue(value)
}