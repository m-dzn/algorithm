from collections import deque

POSITION_LIMIT = 100001
time = [0] * POSITION_LIMIT

N, K = map(int, input().split())

def bfs(start, end):
    q = deque()
    q.append(start)

    while q:
        x = q.popleft()

        if x == end:
            return time[x]

        for nx in (x - 1, x + 1, x * 2):
            if 0 <= nx < POSITION_LIMIT and time[nx] == 0:
                time[nx] = time[x] + 1
                q.append(nx)
        

fastest_time = bfs(N, K)
print(fastest_time)