// 백준 2741번 N 찍기
fun main() = with(System.`in`.bufferedReader()) {
  val N = readln().toInt()

  println(getNumbers(N))
  close()
}

fun getNumbers(n: Int): String {
  val sb = StringBuilder()

  for(num in 1..n) {
    sb.appendLine(num)
  }

  return sb.toString()
}