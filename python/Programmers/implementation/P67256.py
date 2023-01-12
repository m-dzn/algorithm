# Level1 > 2020 카카오 인턴십 > 키패드 누르기

leftHandLoc =   (4, 1)
rightHandLoc =  (4, 3)

HAND = {
    'left': 	'L',
    'right': 	'R'
}

def solution(numbers, hand):
    global leftHandLoc
    global rightHandLoc
    leftHandLoc =   (4, 1)
    rightHandLoc =  (4, 3)

    answer =        ''
    
    dominantHand =  HAND[hand]
    
    for number in numbers:
        pressinghand, loc =     getPressingHandAndLoc(number, dominantHand)
        setHandLoc(pressinghand, loc)
        answer +=               pressinghand
    
    return answer

"""
키패드를 누른 손과 눌린 키의 좌표를 반환하는 함수
"""
def getPressingHandAndLoc(number, dominantHand):
    loc =                   getLoc(number)
    closerHand =            getCloserHand(number, dominantHand, loc)
    
    if (number % 3 == 2 or number == 0):    return closerHand, loc
    if (number % 3 == 1):                   return HAND['left'], loc
    return HAND['right'], loc

"""
현재 키패드 위치에서 더 가까운 손가락을 반환하는 함수
"""
def getCloserHand(number, dominantHand, loc):
    hand = HAND['left']
    
    leftDistance =  getDistance(loc, leftHandLoc)
    rightDistance = getDistance(loc, rightHandLoc)
    
    # 가까운 손을 반환하되, 양손의 거리가 같으면 주손을 반환합니다.
    if      (leftDistance > rightDistance):     hand = HAND['right']
    elif    (leftDistance == rightDistance):    hand = dominantHand
    return hand

"""
키와 손가락이 떨어져있는 거리를 구하는 함수
"""
def getDistance(rowCol1, rowCol2):
    rowDiff = abs(rowCol1[0] - rowCol2[0])
    colDiff = abs(rowCol1[1] - rowCol2[1])
    return rowDiff + colDiff

"""
입력받은 숫자 키패드의 좌표를 반환하는 함수
"""
def getLoc(number):
    if (number == 0): return (4, 2)

    row = (number - 1) // 3 + 1
    col = (number - 1) % 3 + 1
    
    return (row, col)

"""
현재 손가락 위치를 저장하는 함수
"""
def setHandLoc(hand, loc):
    global leftHandLoc
    global rightHandLoc
    
    if (hand == HAND['left']):      leftHandLoc = loc
    else:                           rightHandLoc = loc


# 테스트 코드

inputs = [
    ([1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5]	, "right", "LRLLLRLLRRL"),
    ([7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2], "left", "LRLLRRLLLRR"),
    ([1, 2, 3, 4, 5, 6, 7, 8, 9, 0], "right", "LLRLLRLLRL"),
]

for i in range(len(inputs)):
    numbers =   inputs[i][0]
    hand =      inputs[i][1]
    answer =    inputs[i][2]

    print(numbers, hand, answer)

    if (solution(numbers, hand) == answer): print("Pass")
    else: print("Fail")