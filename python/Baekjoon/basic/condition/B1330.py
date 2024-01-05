# 브론즈 V > 두 수 비교하기
A, B = map(int, input().split(' '))

result = '>'

if A < B: result = '<'
elif A == B: result = '=='

print(result)
