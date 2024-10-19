import sys
input = sys.stdin.readline

t = int(input())

# 최대공약수 계산
def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)

# 처리
for _ in range(t):
    tokens = list(map(int, input().split()))

    n = tokens[0]
    numbers = tokens[1:]

    sum = 0

    # 가능한 모든 쌍 순회
    for i in range(n - 1):
        for j in range(i + 1, n):
            sum += gcd(numbers[i], numbers[j])

    print(sum)