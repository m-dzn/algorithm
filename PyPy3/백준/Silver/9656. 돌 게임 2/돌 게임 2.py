N = int(input())

dp = [0, 0, 1, 0]

for i in range(4, N + 1):
    if dp[i - 3] == 0 and dp[i - 1] == 0:
        dp.append(1)
    else:
        dp.append(0)

print("CY" if dp[N] == 0 else "SK")