from collections import deque

import sys
input = sys.stdin.readline

dx = [-1, -1, -1, 0, 0, 1, 1, 1]
dy = [-1, 0, 1, -1, 1, -1, 0, 1]

def bfs(x, y):
    q = deque()
    q.append((x, y))
    visited[x][y] = True

    while q:
        x, y = q.popleft()

        for i in range(len(dx)):
            nx = x + dx[i]
            ny = y + dy[i]

            if not (0 <= nx < h and 0 <= ny < w): continue
            if visited[nx][ny]: continue
            if world_map[nx][ny] == 0: continue

            visited[nx][ny] = True
            q.append((nx, ny))

line = '';
while True:
    line = input().strip()
    
    if line == '0 0': break

    w, h = map(int, line.split())
    world_map = [list(map(int, input().split())) for _ in range(h)]

    visited = [[False] * w for _ in range(h)]
    count = 0
    for x in range(h):
        for y in range(w):
            if world_map[x][y] == 1 and not visited[x][y]:
                bfs(x, y)
                count += 1

    print(count)