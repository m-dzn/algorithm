import sys
input = sys.stdin.readline

# 입력
n = int(input())

if n == 0:
    print(0)
    exit()

opinions = []

for _ in range(n):
    opinion = int(input())
    opinions.append(opinion)

sum = 0

# 처리
## 모든 사람 난이도 의견의 30% 절사평균
## 가장 큰 값 15%, 가장 작은 값 15% 제외 후 평균 계산
def round_off(number):
    if number - int(number) >= 0.5:
        return int(number) + 1
    else:
        return int(number)

criteria = round_off(n * 0.15)

opinions.sort()

for i in range(criteria, n - criteria):
    sum += opinions[i]

trimmed_mean = round_off(sum / (n - 2 * criteria))
    
# 출력
print(trimmed_mean)