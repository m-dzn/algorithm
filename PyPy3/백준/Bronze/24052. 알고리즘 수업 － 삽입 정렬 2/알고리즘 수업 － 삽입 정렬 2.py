# 입력
N, K = map(int, input().split())
A = list(map(int, input().split()))

# 처리
def check_and_print_array(count, K, array):
    if count == K:
        print(*A)
        exit()

def insertion_sort(A):
    count = 0

    for i in range(1, N):
        loc = i - 1
        new_item = A[i]

        while 0 <= loc and new_item < A[loc]:
            A[loc + 1] = A[loc]
            loc -= 1
            count += 1

            check_and_print_array(count, K, A)

        if loc + 1 != i:
            A[loc + 1] = new_item
            count += 1

            check_and_print_array(count, K, A)

insertion_sort(A)

# 출력
print(-1)