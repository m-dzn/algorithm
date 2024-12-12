import math

##### 추상화 #####
def get_min_count_of_sq_nums(n):
    # 1단계 : 필요한 변수 초기화
    dp = [0] * (n + 1)
    
    # 2단계 : 탐색 효율을 높이기 위해 n의 제곱근 구하기
    sqrt_of_n = int(math.sqrt(n))

    k = 1
    while k <= sqrt_of_n:
        dp[k ** 2] = 1
        k += 1

    # 3단계 : 제곱수 탐색
    for i in range(1, n + 1):
        if dp[i] != 0:
            continue

        j = 1
        
        while j * j <= i:
            j_sq = j * j
            
            if dp[i] == 0:
                dp[i] = dp[j_sq] + dp[i - j_sq]
            else:
                dp[i] = min(dp[i], dp[j_sq] + dp[i - j_sq])

            j += 1
            
    return dp[n]
        
# 1단계 : n 입력받기
n = int(input())

# 2단계 : 합해서 n이 되는 제곱 수 최소 개수 계산
min_count_of_sq_nums = get_min_count_of_sq_nums(n)

# 3단계 : 출력
print(min_count_of_sq_nums)
