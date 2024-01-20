import sys

input = sys.stdin.readline

T = int(input())


# 신장 트리의 간선 최소 개수는 항상 노드 개수 - 1개
def test():
    N, M = map(int, input().strip().split())

    for m in range(M):
        input()

    print(N - 1)


if __name__ == '__main__':
    for _ in range(T):
        test()