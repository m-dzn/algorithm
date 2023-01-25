import java.util.*

// 실버 IV > ATM
fun main() = with(System.`in`.bufferedReader()) {
    fun getInputs(): MutableList<Int> {
        readln().toInt()
        val st = StringTokenizer(readln())
    
        val waitingTimes = mutableListOf<Int>()
        while (st.hasMoreTokens()) {
            val waitingTime = st.nextToken().toInt()
            waitingTimes.add(waitingTime)
        }
        
        return waitingTimes
    }
    
    val waitingTimes = getInputs()
    val atm = ATM(waitingTimes)
    atm.minimizeTotalWaitingTime()
    
    val totalWaitingTime = atm.totalWaitingTime
    
    print(totalWaitingTime)
}

class ATM(
    private val waitingTimes: MutableList<Int>
) {
    val totalWaitingTime: Int
        get() {
            return waitingTimes.foldIndexed(0) { index, total, waitingTime ->
                total + waitingTime * (waitingTimes.size - index)
            }
        }
    
    fun minimizeTotalWaitingTime() {
        waitingTimes.sort()
    }
}