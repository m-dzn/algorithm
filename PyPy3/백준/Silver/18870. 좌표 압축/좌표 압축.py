import sys
input = sys.stdin.readline

# 데이터 전처리
n = int(input())
arr = list(map(int, input().split()))

unique_arr = set(arr)
sorted_arr = sorted(unique_arr)

dict = { sorted_arr[i]: i for i in range(len(sorted_arr)) }

for i in arr:
    print(dict[i], end=' ')