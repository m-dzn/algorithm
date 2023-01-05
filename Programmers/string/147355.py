# Level1 > 연습문제 > 크기가 작은 부분 문자열

def solution(t, p):
    answer = 0
    
    for i in range(len(t) - len(p) + 1):
        slicedNumber = getSlicedNumber(t, i, len(p))
        
        if (isLessOrEqual(slicedNumber, p)): answer += 1
    
    return answer

def getSlicedNumber(whole, start, length):
    return whole[start : start + length]

def isLessOrEqual(a, b):
    return a <= b


# 테스트 코드

inputs = [
    ("3141592", "271", 2),
    ("500220839878", "7", 8),
    ("10203", "15", 3),
]

for i in range(len(inputs)):
    t =   inputs[i][0]
    p =      inputs[i][1]
    answer =    inputs[i][2]

    if (solution(t, p) == answer): print("Pass")
    else: print("Fail")