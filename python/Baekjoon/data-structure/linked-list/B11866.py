# 실버 V > 요세푸스 문제 0
import sys
from collections import deque

N, K = list(map(int, sys.stdin.readline().split()))

people = deque()
for i in range(1, N + 1):
    people.append(i)

resultArr = []
while len(people) > 0:
    # popleft, append K - 1회 실시
    for _ in range(K - 1):
        shuffleNumber = people.popleft()
        people.append(shuffleNumber)
    
    # popleft 후 해당 번호를 출력 대기열에 추가
    targetNumber = people.popleft()
    resultArr.append(targetNumber)

print(f'<{", ".join(map(str, resultArr))}>')