# 브론즈 I > 달팽이는 올라가고 싶다
import math

A, B, V = list(map(int, input().split(' ')))

answer = math.ceil((V - B) / (A - B))

print(answer)