# 입력
N = int(input())
A = list(map(int, input().split()))
B = list(map(int, input().split()))

# 처리
answer = 0

def selection_sort(A):
    global answer

    for last in range(N - 1, 0, -1):
        if A == B:
            break
            
        max_idx = A.index(max(A[:last + 1]))

        if last != max_idx:
            A[last], A[max_idx] = A[max_idx], A[last]

selection_sort(A)

# 출력
print(1 if A == B else 0)