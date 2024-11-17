import sys
input = sys.stdin.readline

from collections import deque

dx = [2, 1, -1, -2, -2, -1, 1, 2]
dy = [1, 2, 2, 1, -1, -2, -2, -1]

t = int(input())

def bfs(start, end):
    q = deque()
    q.append(start)

    while q:
        x, y = q.popleft()

        if x == end[0] and y == end[1]:
            print(board[x][y] - 1)
            return True

        for i in range(8):
            nx = x + dx[i]
            ny = y + dy[i]
            
            if not (0 <= nx < n and 0 <= ny < n): continue
            if board[nx][ny]: continue

            board[nx][ny] = board[x][y] + 1
            q.append([nx, ny])

    return False

for _ in range(t):
    n = int(input())
    start = list(map(int, input().split()))
    end = list(map(int, input().split()))

    board = [[0] * n for _ in range(n)]
    board[start[0]][start[1]] = 1
    bfs(start, end)
    