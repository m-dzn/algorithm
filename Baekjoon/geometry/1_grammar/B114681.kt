import java.io.*

// 백준 114681번 사분면 고르기
fun main() {
  val reader = BufferedReader(InputStreamReader(System.`in`))

  val x = reader.readLine().toInt()
  val y = reader.readLine().toInt()

  println(getQuadrant(x, y))

  reader.close()
}

fun getQuadrant(x: Int, y: Int): Int {
  if (x > 0) {
    return if (y > 0) 1 else 4
  } else {
    return if (y > 0) 2 else 3
  }
}