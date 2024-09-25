N, K = map(int, input().split())
numbers = list(map(int, input().split()))

answer = "-1"

def selection_sort(numbers):
    global answer
    
    count = 0
    
    for last in range(len(numbers) - 1, 0, -1):
        max_idx = last
        
        for i in range(last + 1):
            if numbers[max_idx] < numbers[i]:
                max_idx = i

        if last != max_idx:
            numbers[max_idx], numbers[last] = numbers[last], numbers[max_idx]
            count += 1

            if count == K:
                answer = ' '.join(map(str, numbers))
                return

selection_sort(numbers)

print(answer)