import sys
input = sys.stdin.readline

def swap(array, i, j):
    array[i], array[j] = array[j], array[i]

# 입력
N, M = map(int, input().split())

# 처리
buckets = [str(i + 1) for i in range(N)]
for _ in range(M):
    i, j = map(int, input().split())
    swap(buckets, i - 1, j - 1)

# 출력
print(' '.join(buckets))