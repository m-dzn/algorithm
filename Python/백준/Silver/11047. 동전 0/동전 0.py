N, K = list(map(int, input().split()))

coins = []

for i in range(N):
    coin = int(input())
    coins.append(coin)

remainder = K
num_of_coins = 0
for coin in reversed(coins):
    num_of_coins += remainder // coin
    remainder %= coin

print(num_of_coins)