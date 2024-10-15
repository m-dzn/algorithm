import sys
input = sys.stdin.readline

# 자료구조 준비
array = []
visited = []

# 입력
N, M = map(int, input().split())

# 로직
def dfs(x, y):
    visited[x][y] = True

    if array[x][y] == '|':
        if x + 1 < N and array[x + 1][y] == '|' and visited[x + 1][y] == False:
            dfs(x + 1, y)
        else:
            return
            
    elif array[x][y] == '-':
        if y + 1 < M and array[x][y + 1] == '-' and visited[x][y + 1] == False:
            dfs(x, y + 1)
        else:
            return

# 처리
count = 0

for _ in range(N):
    visited.append([False] * M)

for _ in range(N):
    row = list(input())
    array.append(row)

for i in range(N):
    for j in range(M):
        if visited[i][j] == False:
            dfs(i, j)
            count += 1

# 출력
print(count)