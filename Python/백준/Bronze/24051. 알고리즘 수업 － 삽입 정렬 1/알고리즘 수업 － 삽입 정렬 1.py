# 비즈니스 로직
def insertion_sort(array, K):
  save_count = 0

  for i in range(1, len(array)):
    target_item = array[i]

    location = i - 1

    while 0 <= location and target_item < array[location]:
      array[location + 1] = array[location]
      save_count += 1
      if save_count == K:
        return print(array[location])

      location -= 1

    if location + 1 != i:
      array[location + 1] = target_item
      save_count += 1
      if save_count == K:
        return print(target_item)

  print(-1)

# 입력
N, K = list(map(int, input().split()))
numbers = list(map(int, input().split()))

# 처리
insertion_sort(numbers, K)