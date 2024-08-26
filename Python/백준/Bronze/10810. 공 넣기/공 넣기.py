N, M = list(map(int, input().split()))

baskets = ["0"] * N

for _ in range(M):
    i, j, k = list(map(int, input().split()))

    for index in range(i, j + 1):
        baskets[index - 1] = str(k)

print(' '.join(baskets))