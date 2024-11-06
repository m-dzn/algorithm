import sys
input = sys.stdin.readline

T = int(input())

for _ in range(T):
    n = int(input())
    stickers = [list(map(int, input().split())) for _ in range(2)]

    dp = [[0] * n for _ in range(2)]

    dp[0][0] = stickers[0][0]
    dp[1][0] = stickers[1][0]

    # 스티커 점수가 1x2 행렬일 때
    if n == 1:
        print(max(dp[0][0], dp[1][0]))
        continue

    dp[0][1] = stickers[1][0] + stickers[0][1]
    dp[1][1] = stickers[0][0] + stickers[1][1]

    # 스티커 점수가 2x2 행렬일 때
    if n == 2:
        print(max(dp[0][1], dp[1][1]))
        continue

    # 점화식 (스티커 점수가 nx2 행렬일 때)
    for i in range(2, n):
        dp[0][i] = max(dp[1][i - 2], dp[1][i - 1]) + stickers[0][i]
        dp[1][i] = max(dp[0][i - 2], dp[0][i - 1]) + stickers[1][i]

    print(max(dp[0][-1], dp[1][-1]))
    