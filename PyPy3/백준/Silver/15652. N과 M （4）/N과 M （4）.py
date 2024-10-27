N, M = map(int, input().split())

temp = []
def dfs(start):
    if len(temp) == M:
        print(*temp)
        return
    
    for num in range(start, N + 1):
        temp.append(num)
        dfs(num)
        temp.pop()

dfs(1)