import sys
input = sys.stdin.readline

change_count = 0

def merge_sort(array, l, r):
    if l < r:
        m = l + (r - l) // 2
        merge_sort(array, l, m)
        merge_sort(array, m + 1, r)
        merge(array, l, m, r)

def merge(array, l, m, r):
    global change_count
    global K
    
    lp = l
    rp = m + 1
    temp_array = []
    
    while lp <= m and rp <= r:
        if array[lp] <= array[rp]:
            temp_array.append(array[lp])
            lp += 1
        else:
            temp_array.append(array[rp])
            rp += 1
    
    while lp <= m:
        temp_array.append(array[lp])
        lp += 1
    while rp <= r:
        temp_array.append(array[rp])
        rp += 1
        
    for i in range(len(temp_array)):
        array[l + i] = temp_array[i]
        change_count += 1
        
        if change_count == K:
            print(' '.join(map(str, array)))
            exit()

# 입력
N, K = map(int, input().split())
numbers = list(map(int, input().split()))

# 처리
merge_sort(numbers, 0, len(numbers) - 1)

# 출력
print(-1)