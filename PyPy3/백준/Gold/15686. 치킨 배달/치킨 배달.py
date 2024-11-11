import sys
input = sys.stdin.readline

N, M = map(int, input().split())

min_cc_distance = int(1e9)

graph = []
house = []
chicken = []

for row in range(N):
    graph.append(list(map(int, input().split())))

    for col in range(N):
        point = graph[row][col]
        
        if point == 1:
            house.append((row, col))
        elif point == 2:
            chicken.append((row, col))

visited = [False] * len(chicken)

def dfs(num, count):
    global min_cc_distance

    if count == M:
        cc_distance = 0
    
        for hx, hy in house:
            min_distance = int(1e9)

            for i in range(len(visited)):
                cx, cy = chicken[i]

                if visited[i]:
                    distance = abs(hx - cx) + abs(hy - cy)
                    min_distance = min(distance, min_distance)

            cc_distance += min_distance

        min_cc_distance = min(cc_distance, min_cc_distance)
        return

    for i in range(num, len(chicken)):
        if not visited[i]:
            visited[i] = True
            dfs(i + 1, count + 1)
            visited[i] = False

dfs(0, 0)

print(min_cc_distance)