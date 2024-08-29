def sort(array):
  for i in range(len(array)):
    for j in range(i, len(array)):
      if array[i] > array[j]:
        swap(array, i, j)

def swap(array, i, j):
  temp = array[i]
  array[i] = array[j]
  array[j] = temp

# 입력
numbers = list(map(int, input().split()))

# 처리
sort(numbers)

# 출력
print(*numbers)