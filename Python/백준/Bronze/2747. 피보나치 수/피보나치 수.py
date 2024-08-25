MAX_N = 45

dp = [0] * (MAX_N + 1)
dp[1] = 1
dp[2] = 1

def fibonacci(n):
    if dp[n]: return dp[n]
    
    dp[n] = fibonacci(n - 2) + fibonacci(n - 1)
    return dp[n]

# 입력
n = int(input())

# 처리
result =fibonacci(n)

# 출력
print(result)