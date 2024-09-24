import sys

input = sys.stdin.readline

answer = ""

def swap(numbers, a, b):
    numbers[a], numbers[b] = numbers[b], numbers[a]

def selection_sort(numbers, K):
    global answer
    
    count = 0
    
    for last in range(len(numbers) - 1, 0, -1):
        max_idx = last
        max_num = numbers[last]
        
        for i in range(last):
            if max_num < numbers[i]:
                max_idx = i
                max_num = numbers[i]

        if last != max_idx:
            swap(numbers, max_idx, last)
            count += 1
            if count == K:
                a = numbers[max_idx]
                b = numbers[last]
                answer = ' '.join(map(str, [a, b]))

N, K = map(int, input().split())
numbers = list(map(int, input().split()))

selection_sort(numbers, K)

if answer == "":
    answer = "-1"

print(answer)