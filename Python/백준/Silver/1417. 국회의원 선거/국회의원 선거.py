import sys

input = sys.stdin.readline

# 입력
N = int(input())

dasom = int(input())
votes = []

for _ in range(N - 1):
    votes.append(int(input()))

# 처리
votes.sort(reverse=True)

count = 0

# 출력
if N == 1:
    print(0)
else:
    while votes[0] >= dasom:
        dasom += 1
        votes[0] -= 1
        count += 1
        votes.sort(reverse=True)

    print(count)
