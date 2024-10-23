from collections import deque

N = int(input())

deck = deque()

for num in range(N, 0, -1):
    deck.appendleft(num)

    for i in range(num):
        last_card = deck.pop()
        deck.appendleft(last_card)

print(*deck)