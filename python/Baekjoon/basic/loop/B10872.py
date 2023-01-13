# 브론즈 V > 팩토리얼
N = int(input())

def factorial(N):
    result = 1

    for num in range(1, N + 1):
        result *= num
    
    return result

print(factorial(N))