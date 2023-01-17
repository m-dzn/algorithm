# 브론즈 2 > 분해합

def getInputs():
    Nstr = input()
    N = int(Nstr)
    return (Nstr, N)

def getLoopRange(Nstr, N):
    """
    성능 개선 함수 : 브루트 포스 알고리즘의 반복 범위를 줄여줍니다.
    """
    minX = max(1, N - 9 * len(Nstr))

    return range(minX, N)


def isCreatorOf(N, creator):
    """
    생성자(creator)의 분해합(decomposition)이
    N이면 True 아니면 False를 반환합니다.
    """
    sumOfDigits = sum([int(i) for i in str(creator)])
    decomposition = creator + sumOfDigits
    return decomposition == N


if __name__ == '__main__':
    Nstr, N = getInputs()
    loopRange = getLoopRange(Nstr, N)
    
    answer = 0
    for x in loopRange:
        if isCreatorOf(N, x):
            answer = x
            break
    
    print(answer)
