N, M = map(int, input().split())

numbers = sorted(list(map(int, input().split())))

temp = []
visited = [False for _ in range(N)]
def dfs():
    if len(temp) == M:
        print(*temp)
        return

    for i in range(N):
        if visited[i]:
            continue
            
        number = numbers[i]
        
        temp.append(number)
        visited[i] = True
        dfs()
        temp.pop()
        visited[i] = False

dfs()