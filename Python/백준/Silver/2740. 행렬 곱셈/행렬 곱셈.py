import sys
input = sys.stdin.readline

N, M = map(int, input().split())

A = []

for i in range(N):
    row = list(map(int, input().split()))
    A.append(row)

M, K = map(int, input().split())

B = []

for j in range(M):
    row = list(map(int, input().split()))
    B.append(row)

matrix = [[0 for _ in range(K)] for _ in range(N)]

for n in range(N):
    for k in range(K):
        for m in range(M):
            matrix[n][k] += A[n][m] * B[m][k]

for row in matrix:
    for num in row:
        print(num, end = ' ')
    print()