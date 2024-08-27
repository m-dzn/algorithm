# 변수
count = 0

# 로직
def merge_sort(array, l, r):    
    if l < r:
        m = l + (r - l) // 2
        merge_sort(array, l, m)
        merge_sort(array, m + 1, r)
        merge(array, l, r)

def merge(array, l, r):
    global count
    global K
    global result

    m = l + (r - l) // 2
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

    for i in range(l, r + 1):
        array[i] = temp_array[i - l]
        
        count += 1
        if count == K:
            print(array[i])
            exit()
        
# 입력
N, K = map(int, input().split())

numbers = list(map(int, input().split()))

# 처리
merge_sort(numbers, 0, len(numbers) - 1)

# 출력
print(-1)