# 입력
n = int(input())

fib_count = 0
fibonacci_count = 0

# 처리
def fib(n):
    global fib_count
    
    if n == 1 or n == 2:
        fib_count += 1
        return 1

    return fib(n - 1) + fib(n - 2)

def fibonacci(n):
    global fibonacci_count
    
    f = []
    f.append(1)
    f.append(1)

    for i in range(2, n):
        f.append(f[i - 1] + f[i - 2])
        fibonacci_count += 1

    return f[n - 1]

fib(n)
fibonacci(n)

# 출력
print(fib_count, fibonacci_count)