# 실버 V > 덩치
import sys

"""
<문제 요약>
1. 몸무게, 키 모두 크면 '더 크다'
2. 몸무게만 또는 키만 크면 '크다고 할 수 없다'

<풀이법>
기본적으로 브루트 포스로 풀어야 한다
하지만 나보다 '덩치 큰 사람보다 덩치 큰 사람'과의 비교는 건너 뛸 수 있다

이런 특징 때문에 DP와 비슷하게 캐싱해서 풀면 자원 사용 효율을 높일 수 있을 것 같다
"""

N = int(sys.stdin.readline())

weight_height_array = [tuple(map(int, sys.stdin.readline().split())) for x in range(N)]

cache = [[False for col in range(N)] for row in range(N)]

for person1 in range(N):
    weight1, height1 = weight_height_array[person1]

    for person2 in range(person1 + 1, N):
        if cache[person1][person2]:
            continue

        weight2, height2 = weight_height_array[person2]

        if weight1 < weight2 and height1 < height2:
            cache[person1][person2] = True

            for i in range(N):
                cache[person1][i] = cache[person2][i] if cache[person2][i] else cache[person1][i]
        elif weight1 > weight2 and height1 > height2:
            cache[person2][person1] = True

rank = [cache[person].count(True) + 1 for person in range(N)]

print(" ".join(map(str, rank)))