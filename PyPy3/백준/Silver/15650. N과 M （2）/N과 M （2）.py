# 준비
temp = []

# 입력
N, M = map(int, input().split())

def dfs(start):
    if len(temp) == M:
        print(' '.join(map(str, temp)))
        return

    for num in range(start, N + 1):
        if num not in temp:
            temp.append(num)
            dfs(num + 1)
            temp.pop()

dfs(1)