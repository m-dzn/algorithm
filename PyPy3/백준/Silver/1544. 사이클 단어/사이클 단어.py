import sys
input = sys.stdin.readline

from collections import deque

def rotate_word(w1, w2):
    if len(w1) != len(w2):
        return w2

    w2 = deque(w2)

    for _ in range(len(w2)):
        w2.rotate(1)
        w2_str = ''.join(w2)

        if w1 == w2_str:
            return w2_str

    return ''.join(w2)

N = int(input())
words = [input().strip() for _ in range(N)]

for i in range(N):
    for j in range(i + 1, N):
        if words[i] != words[j]:
            words[j] = rotate_word(words[i], words[j])

print(len(set(words)))