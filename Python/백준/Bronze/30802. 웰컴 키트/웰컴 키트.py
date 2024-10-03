import math

# 입력
N = int(input())
t_shirts_needs = list(map(int, input().split()))
T, P = map(int, input().split())

# 처리
t_set = sum(map(lambda need: math.ceil(need / T), t_shirts_needs))
p_set = N // P
p_remaining = N % P

# 출력
print(t_set)
print(p_set, p_remaining)
