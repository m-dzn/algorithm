import java.io.*
import java.util.*

// 백준 4344번 평균은 넘겠지
fun main() {
  val reader = BufferedReader(InputStreamReader(System.`in`))
  val sb = StringBuilder()

  repeat(reader.readLine().toInt()) {
    val tokens = StringTokenizer(reader.readLine())

    val numOfStudents = tokens.nextToken().toInt()
    
    val scores = IntArray(numOfStudents)
    var sum = 0
    var studentsAboveAvg = 0

    for (i in 0 until(numOfStudents)) {
      val score = tokens.nextToken().toInt() 
      scores[i] = score
      sum += score
    }
    
    val avg = sum / numOfStudents

    for(score in scores) {
      if (score > avg) {
        studentsAboveAvg ++
      }
    }

    sb.appendLine("${String.format("%.3f", (studentsAboveAvg.toDouble() / numOfStudents) * 100)}%")
  }

  println(sb)
  reader.close()
}