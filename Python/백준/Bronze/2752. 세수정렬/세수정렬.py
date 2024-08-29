def merge_sort(array, left, right):
  if left < right:
    mid = left + (right - left) // 2
    merge_sort(array, left, mid)
    merge_sort(array, mid + 1, right)
    merge(array, left, mid, right)

def merge(array, left, mid, right):
  temp_array = []

  lp = left
  rp = mid + 1

  while lp <= mid and rp <= right:
    if array[lp] <= array[rp]:
      temp_array.append(array[lp])
      lp += 1
    else:
      temp_array.append(array[rp])
      rp += 1

  while lp <= mid:
    temp_array.append(array[lp])
    lp += 1
  while rp <= right:
    temp_array.append(array[rp])
    rp += 1

  for i in range(left, right + 1):
    array[i] = temp_array[i - left]

# 입력
numbers = list(map(int, input().split()))

# 처리
merge_sort(numbers, 0, len(numbers) - 1)

# 출력
print(*numbers)