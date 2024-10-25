count = 0

N = int(input())

for _ in range(N):
    chars = input()

    stack = []
    
    for ch in chars:
        if len(stack) == 0:
            stack.append(ch)
        elif stack[-1] == ch:
            stack.pop()
        else:
            stack.append(ch)

    if len(stack) == 0:
        count += 1

print(count)
