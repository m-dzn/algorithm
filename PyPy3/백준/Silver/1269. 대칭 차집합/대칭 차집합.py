len_a, len_b = map(int, input().split())

A = set(map(int, input().split()))
B = set(map(int, input().split()))

inter = A & B

print(len_a + len_b - 2 * len(inter))