import sys
input = sys.stdin.readline

N = int(input())
numbers = list(map(int, input().split()))

dp = [1] * N

max_count = 1

for i in range(1, N):
    for j in range(i):
        if numbers[i] > numbers[j]:
            dp[i] = max(dp[i], dp[j] + 1)

            if dp[i] > max_count:
                max_count = dp[i]

print(max_count)