# Level1 > 월간 코드 챌린지 시즌3 > 나머지가 1이 되는 수 찾기

import math

MILLION = 1000000

def solution(n):
    target = n - 1
    
    half = math.ceil(target / 2)
    
    numList = list(False for i in range(0, MILLION + 1))
    
    for divider in range(2, half):
        if (numList[divider] == True): continue
        
        # 나머지 0인지 체크하기
        if (target % divider == 0): return divider
        
        # 배수 전부 True 처리
        for multiple in range(divider, MILLION, divider):
            numList[multiple] = True
        
    
    return target