def sort(array):
  for i in range(len(array)):
    for j in range(i, len(array)):
      if array[i] > array[j]:
        swap(array, i, j)

def swap(array, i, j):
  array[i], array[j] = array[j], array[i]

# 입력
sum = 0
numbers = []

for _ in range(5):
  num = int(input())
  sum += num
  numbers.append(num)

# 처리
avg = sum // 5
sort(numbers)

# 출력
print(avg)
print(numbers[2])
