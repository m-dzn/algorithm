# 브론즈 V > 개수 세기
N = int(input())
integers = map(int, input().split(' '))
v = int(input())

filteredList = list(filter(lambda x : x == v, integers))
count = len(filteredList)
print(count)