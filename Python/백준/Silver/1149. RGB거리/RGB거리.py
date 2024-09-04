import sys
input = sys.stdin.readline

def get_rgb_cost_from_input():
    return map(int, input().split())

# 상수
INIT_COST = -1

# 입력
N = int(input())

# 처리
street = [[INIT_COST, INIT_COST, INIT_COST] for _ in range(N)]

r, g, b = get_rgb_cost_from_input()
street[0] = [r, g, b]

for i in range(1, N):
    r, g, b = get_rgb_cost_from_input()
    
    prev_house = street[i - 1]
    current_house = street[i]
    
    current_house[0] = min(prev_house[1], prev_house[2]) + r
    current_house[1] = min(prev_house[0], prev_house[2]) + g
    current_house[2] = min(prev_house[0], prev_house[1]) + b
    
min_cost = min(street[N - 1])
    

# 출력
print(min_cost)