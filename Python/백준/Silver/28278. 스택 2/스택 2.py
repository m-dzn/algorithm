import sys
input = sys.stdin.readline

stack = []

# 입력
N = int(input())

# 처리
for _ in range(N):
    array = list(map(int, input().split()))

    command = array[0]
    if command == 1:
        stack.append(array[1])
    elif command == 2:
        if stack:
            print(stack.pop())
        else:
            print(-1)
    elif command == 3:
        print(len(stack))
    elif command == 4:
        print(1 if not stack else 0)
    elif command == 5:
        if stack:
            print(stack[-1])
        else:
            print(-1)
