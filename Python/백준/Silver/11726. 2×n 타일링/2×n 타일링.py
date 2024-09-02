dp = []
dp.append(1)
dp.append(2)

def calc_cases(n):
    if n >= 3:
        for i in range(2, n):
            dp.append(dp[i - 2] + dp[i - 1])
    
    return dp[n - 1]

# 입력
n = int(input())

# 처리
answer = calc_cases(n)

# 출력
print(answer % 10007)