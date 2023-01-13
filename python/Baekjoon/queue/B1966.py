# 실버 III > 프린터 큐
import heapq

T = int(input())

result = []

for t in range(T):
    N, M = map(int, input().split(' '))
    queue = list(map(int, input().split(' ')))
    
    count = 0
    
    while (M != -1):
        if queue[0] == max(queue):
            del queue[0]
            M -= 1
            count += 1
        else:
            queue.append(queue[0])
            del queue[0]

            if M == 0:
                M = len(queue) - 1
            else:
                M -= 1

    print(count)