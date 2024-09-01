import sys

# 입력
N = int(input())

end_point: int = 0
answer: int = 0

array = []

# 처리
for _ in range(N):
  start, end = map(int, sys.stdin.readline().split())
  array.append([start, end])

array.sort(key=lambda x: (x[1], x[0]))

for start, end in array:
  if end_point <= start:
    answer += 1
    end_point = end

# 출력
print(answer)
