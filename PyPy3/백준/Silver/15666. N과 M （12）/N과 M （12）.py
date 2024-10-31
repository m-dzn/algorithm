N, M = map(int, input().split())
numbers = sorted(list(map(int, input().split())))

sequence = []

def dfs(start):
    if len(sequence) == M:
        print(*sequence)
        return

    remember_me = 0
    for i in range(start, N):
        number = numbers[i]

        if remember_me != number:
            sequence.append(number)
            remember_me = number
            dfs(i)
            sequence.pop()

dfs(0)