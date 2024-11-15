from collections import deque

import sys
input = sys.stdin.readline

M, N = map(int, input().split())

map = [list(map(int, input().split())) for _ in range(N)]

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

q = deque([])

for i in range(N):
    for j in range(M):
        if map[i][j] == 1:
            q.append([i, j])

def bfs():
    while q:
        x, y = q.popleft()

        for i in range(4):
            nx, ny = dx[i] + x, dy[i] + y
            
            if 0 <= nx < N and 0 <= ny < M and map[nx][ny] == 0:
                map[nx][ny] = map[x][y] + 1
                q.append([nx, ny])

bfs()


count = 0
for row in map:
    for col in row:
        if col == 0:
            print(-1)
            exit()

    count = max(count, max(row))

print(count - 1)