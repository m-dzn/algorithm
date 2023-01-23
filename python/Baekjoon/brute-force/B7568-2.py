# 실버 V > 덩치
import sys

def readline() -> str:
    return sys.stdin.readline()

N = int(readline())

weight_height_array = [tuple(map(int, readline().split())) for _ in range(N)]

for person1 in weight_height_array:
    rank = 1

    for person2 in weight_height_array:
        if person1[0] < person2[0] and person1[1] < person2[1]:
            rank += 1

    print(rank, end = " ")