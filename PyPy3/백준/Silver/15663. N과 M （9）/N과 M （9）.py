# 입력
N, M = map(int, input().split())
numbers = list(map(int, input().split()))

# 준비
sequence = []
visited = [0] * N
sorted_numbers = sorted(numbers)

# 로직
def dfs():
    if len(sequence) == M:
        print(*sequence)
        return

    duplicated_number = 0
    for i in range(N):
        number = sorted_numbers[i]
        if number != duplicated_number and visited[i] == False:
            sequence.append(number)
            visited[i] = True
            duplicated_number = number
            
            dfs()
            
            sequence.pop()
            visited[i] = False

# 실행
dfs()