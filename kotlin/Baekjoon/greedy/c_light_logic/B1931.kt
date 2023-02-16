package Baekjoon.greedy.c_light_logic

import java.util.StringTokenizer

// 실버 I > 회의실 배정
fun main() {
    val N = readln().toInt()
    
    val meetingList = mutableListOf<Meeting>()
    repeat(N) {
        val st = StringTokenizer(readln())
        val startTime = st.nextToken().toInt()
        val endTime = st.nextToken().toInt()
        
        val meeting = Meeting(startTime, endTime)
        meetingList.add(meeting)
    }
    
    meetingList.sortWith(compareBy({ it.endTime }, { it.startTime }))
    
    var numOfMeetings = 0
    var lastEndTime = 0
    meetingList.forEach { meeting ->
        if (meeting.startTime >= lastEndTime) {
            lastEndTime = meeting.endTime
            numOfMeetings++
        }
    }
    
    println(numOfMeetings)
}

private data class Meeting(
    val startTime: Int,
    val endTime: Int)