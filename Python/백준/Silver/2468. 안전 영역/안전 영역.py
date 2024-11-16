import sys
input = sys.stdin.readline
sys.setrecursionlimit(100000)

N = int(input())

water_map = [list(map(int, input().split())) for _ in range(N)]

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

def dfs(x, y, h):
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if not (0 <= nx < N and 0 <= ny < N): continue
        if visted[nx][ny]: continue

        if water_map[nx][ny] > h:
            visted[nx][ny] = True
            dfs(nx, ny, h)

# 실행
answer = 1
map_max_h = max(map(max, water_map))
for current_h in range(map_max_h):
    visted = [[False] * N for _ in range(N)]

    count = 0

    for i in range(N):
        for j in range(N):
            if not (water_map[i][j] > current_h): continue
                
            if not visted[i][j]:
                count += 1
                visted[i][j] = True
                dfs(i, j, current_h)
                
        answer = max(answer, count)

print(answer)