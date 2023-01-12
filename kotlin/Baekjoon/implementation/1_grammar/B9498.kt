import java.io.*

// 백준 9498번 시험 성적
fun main() {
  val reader = BufferedReader(InputStreamReader(System.`in`))

  val score = reader.readLine().toInt()
  var credit = getCreditOfScore(score)

  println(credit)

  reader.close()
}

fun getCreditOfScore(score: Int): Char {
  when (score) {
    in 90..100 -> return 'A'
    in 80..89 -> return 'B'
    in 70..79 -> return 'C'
    in 60..69 -> return 'D'
    else -> return 'F'
  }
}