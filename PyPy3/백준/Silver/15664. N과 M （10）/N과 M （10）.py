N, M = map(int, input().split())
numbers = sorted(list(map(int, input().split())))

temp = []
def dfs(start_index):
    if len(temp) == M:
        print(*temp)
        return

    duplicate_check = 0
    for i in range(start_index, N):
        num = numbers[i]
        
        if duplicate_check != num:
            temp.append(num)
            duplicate_check = num
            dfs(i + 1)
            temp.pop()

dfs(0)