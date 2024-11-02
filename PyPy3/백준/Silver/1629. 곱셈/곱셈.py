A, B, C = map(int, input().split())

def multi(a, n):
    if n == 1:
        return a % C

    else:
        temp = multi(a, n // 2)

        if n % 2 == 0:
            return (temp * temp) % C
        else:
            return (temp * temp * a) % C

print(multi(A, B))