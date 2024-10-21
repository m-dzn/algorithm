len_A, len_B = map(int, input().split())

A = set(map(int, input().split()))
B = set(map(int, input().split()))

A_minus_B = A - B

print(len(A_minus_B))

if len(A_minus_B) > 0:
    sorted_elements = list(A_minus_B)
    sorted_elements.sort()
    print(*sorted_elements)