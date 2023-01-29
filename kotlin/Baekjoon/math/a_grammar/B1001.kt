import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

// 백준 1001번 A-B
fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val tokens = StringTokenizer(reader.readLine())

    val A = tokens.nextToken().toInt()
    val B = tokens.nextToken().toInt()

    println(A - B)

    reader.close()
}