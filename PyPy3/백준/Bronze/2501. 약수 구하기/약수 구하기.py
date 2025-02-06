N, K = map(int, input().split())

count = 0

answer = 0
for num in range(1, N + 1):
    if N % num == 0:
        count += 1
        if count == K:
            answer = num
            break

print(answer)