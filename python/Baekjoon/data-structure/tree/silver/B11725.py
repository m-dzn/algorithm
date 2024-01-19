import sys

# 자기 호출 개수 제한
sys.setrecursionlimit(10**6)

N = int(input())
tree = [[] for _ in range(N + 1)]
parent = [0] * (N + 1)


def dfs(vertex, visited, graph):
    for i in graph[vertex]:
        if not visited[i]:              # 처음 방문하는 노드 : 부모 노드의 값 (vertex) 을 기록한 뒤 -> 다시 dfs 반복
            visited[i] = vertex
            dfs(i, visited, graph)


def print_parent_node(array):
    for i in range(2, len(array)):
        print(array[i])


for _ in range(N - 1):
    a, b = map(int, input().split())
    tree[a].append(b)
    tree[b].append(a)

dfs(1, parent, tree)

print_parent_node(parent)