from collections import deque

import sys
input = sys.stdin.readline

N, M = map(int, input().split())

graph = [[] for _ in range(N + 1)]

for _ in range(M):
    u,v = map(int, input().split())

    graph[u].append(v)
    graph[v].append(u)

visited = [False] * (N + 1)
def dfs(start):
    visited[start] = True

    for next in graph[start]:
        if not visited[next]:
            dfs(next)

count = 0
for i in range(1, N + 1):
    if not visited[i]:
        dfs(i)

        count += 1

print(count)