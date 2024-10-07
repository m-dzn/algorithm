# 준비
import sys
input = sys.stdin.readline

max_number = -1
row_col = (0, 0)

# 입력 & 처리
for i in range(9):
    numbers = list(map(int, input().split()))

    for j in range(9):
        if numbers[j] > max_number:
            max_number = numbers[j]
            row_col = (i + 1, j + 1)

# 출력
print(max_number)
print(*row_col)
