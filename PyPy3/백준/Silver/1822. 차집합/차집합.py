len_A, len_B = map(int, input().split())

A = set(map(int, input().split()))
B = set(map(int, input().split()))

A_minus_B = A.difference(B)

print(len(A_minus_B))

for num in sorted(A_minus_B):
    print(num, end = ' ')