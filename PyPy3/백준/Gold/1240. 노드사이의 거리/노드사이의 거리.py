from collections import deque

import sys
input = sys.stdin.readline

def bfs(start, find):
    q = deque()
    q.append((start, 0))
    visited = [False] * (N + 1)
    visited[start] = True

    while q:
        node, distance = q.popleft()

        if node == find:
            return distance

        for next_node, next_distance in graph[node]:
            if not visited[next_node]:
                visited[next_node] = True
                q.append((next_node, distance + next_distance))

N, M = map(int, input().split())

graph = [[] for _ in range(N + 1)]

for _ in range(N - 1):
    node1, node2, distance = map(int, input().split())

    graph[node1].append((node2, distance))
    graph[node2].append((node1, distance))

for _ in range(M):
    node1, node2 = map(int, input().split())
    print(bfs(node1, node2))