import sys

input = sys.stdin.readline

n = int(input())

deq = []

for i in range(n):
    commands = input().split()
    command = commands[0]
    
    if len(commands) > 1:
        x = int(commands[1])

    if command == "push_front":
        deq.insert(0, x)

    if command == "push_back":
        deq.append(x)

    if command == "pop_front":
        if len(deq) == 0:
            print(-1)
        else:
            print(deq[0])
            deq.pop(0)

    if command == "pop_back":
        if len(deq) == 0:
            print(-1)
        else:
            print(deq[-1])
            deq.pop()

    if command == "size":
        print(len(deq))

    if command == "empty":
        print(1 if len(deq) == 0 else 0)

    if command == "front":
        if len(deq) == 0:
            print(-1)
        else:
            print(deq[0])

    if command == "back":
        if len(deq) == 0:
            print(-1)
        else:
            print(deq[-1])