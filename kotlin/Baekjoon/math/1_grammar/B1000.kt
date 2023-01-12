import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

// 백준 1000번 A+B
fun main() {
    var reader = BufferedReader(InputStreamReader(System.`in`))
    var tokens = StringTokenizer(reader.readLine())

    var A = tokens.nextToken().toInt()
    var B = tokens.nextToken().toInt()

    println(A + B)

    reader.close()
}