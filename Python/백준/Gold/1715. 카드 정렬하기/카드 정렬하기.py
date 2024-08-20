import sys
from queue import PriorityQueue

input = sys.stdin.readline

N = int(input())

q = PriorityQueue()
for _ in range(N):
    q.put(int(input()))

comparison_count = 0

while q.qsize() != 1:
    new_deck = q.get() + q.get()
    comparison_count += new_deck
    q.put(new_deck)

print(comparison_count)