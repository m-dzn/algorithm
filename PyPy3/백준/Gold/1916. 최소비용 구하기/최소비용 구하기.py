import heapq

import sys
input = sys.stdin.readline

N = int(input())
M = int(input())

graph = [[] for _ in range(N + 1)]
for _ in range(M):
    a, b, cost = map(int, input().split())
    graph[a].append([b, cost])

start, end = map(int, input().split())

costs = [1e9 for _ in range(N + 1)]
costs[start] = 0

heap = []
heapq.heappush(heap, [0, start])

while heap:
    current_cost, current_v = heapq.heappop(heap)

    if costs[current_v] < current_cost:
        continue

    for next_v, next_cost in graph[current_v]:
        sum_cost = current_cost + next_cost

        if sum_cost >= costs[next_v]:
            continue

        costs[next_v] = sum_cost
        heapq.heappush(heap, [sum_cost, next_v])

print(costs[end])