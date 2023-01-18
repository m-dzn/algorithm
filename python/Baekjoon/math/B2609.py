# 브론즈 I > 최대공약수와 최소공배수
N, M = list(map(int, input().split(' ')))

def calcGcd(a: int, b: int): # 유클리드 호제법으로 풀이
    if b == 0: return a

    return calcGcd(b, a % b)

gcd = calcGcd(N, M)

print(gcd)
print(N * M // gcd)