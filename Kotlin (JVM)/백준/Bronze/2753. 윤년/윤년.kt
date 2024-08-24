import java.io.*

fun main() {
  val reader = BufferedReader(InputStreamReader(System.`in`))

  val year = reader.readLine().toInt()
  println(isLeapYear(year))
    
  reader.close()
}

fun isLeapYear(year: Int): Int {
  return if (year % 4 == 0 && year % 100 != 0) 1 else
    if (year % 400 == 0) 1 else 0
}