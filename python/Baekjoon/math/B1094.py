# 실버 V > 막대기
X = int(input())

x = X
num_of_sticks = 0

length = 64
while length >= 1:
    if length <= x:
        num_of_sticks += 1
        x -= length
        
    length /= 2

print(num_of_sticks)