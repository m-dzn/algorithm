import sys
input = sys.stdin.readline

# 변수
fruit_count = {"STRAWBERRY": 0, "BANANA": 0, "LIME": 0, "PLUM": 0}

# 입력
N = int(input())
for _ in range(N):
    fruit, count = input().split()
    count = int(count)

    fruit_count[fruit] += count

# 처리
is_haligali = False
for key, count in fruit_count.items():
    if count == 5:
        is_haligali = True
        break

# 출력
if is_haligali:
    print("YES")
else:
    print("NO")