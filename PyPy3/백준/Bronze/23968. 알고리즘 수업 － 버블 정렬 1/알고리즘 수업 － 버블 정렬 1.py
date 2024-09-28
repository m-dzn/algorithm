import sys
input = sys.stdin.readline

# 입력
N, K = map(int, input().split())
A = list(map(int, input().split()))

# 처리 
count = 0

for last in range(N - 1, 0, -1):
    for i in range(last):
        if A[i] > A[i + 1]:
            A[i], A[i + 1] = A[i + 1], A[i]
            count += 1
            
            if count == K:
                print(f'{A[i]} {A[i + 1]}')
                exit()

# 출력
print(-1)