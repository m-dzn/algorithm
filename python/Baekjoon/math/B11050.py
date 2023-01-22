# 브론즈 I > 이항 계수 1
def binom(n, k):
    if k == 0 or n == k: return 1
    
    return binom(n - 1, k) + binom(n - 1, k - 1)

if __name__ == '__main__':
    N, K = list(map(int, input().split(' ')))

    print(binom(N, K))