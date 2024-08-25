N = int(input())

factorial = 1

for number in range(1, N + 1):
    factorial *= number

print(factorial)