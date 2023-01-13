# 브론즈 V > 문자열
T = int(input())

result = ""

for t in range(T):
    word = input()
    result += f'{word[0]}{word[-1]}\n'

print(result)