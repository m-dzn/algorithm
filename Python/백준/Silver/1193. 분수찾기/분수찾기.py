# 브론즈 I > 분수찾기
def getInputs():
    X = int(input())
    return X

def getDiagonalAndSum(X: int):
    """
    Note: X번째 분수가 위치한 대각선의 번호인 diagonal과 Σn (1 → diagonal)을 구합니다
    
    Returns:
    - diagonal : X번째 분수가 위치하는 대각선의 번호
    - sum :      Σn (1 → diagonal)
    """
    sum = 0
    diagonal = 0

    while X > sum:
        diagonal += 1
        sum += diagonal

    return diagonal, sum

def getPositionOnDiagonal(X: int, diagonal: int, sum: int):
    """
    Returns:
    - position : diagonal번째 대각선 위에서 X가 몇 번째 분수인지 나타내는 값
    """
    
    return X - (sum - diagonal)


def findFraction(diagonal: int, position: int) -> str:
    """
    Note: 대각선 번호와 대각선 상의 위치에 해당하는 분수를 찾아옵니다.

    Returns:
    - fraction : 현재 대각선과 위치에서의 분수 값
    """
    counterPart =           diagonal + 1 - position

    numerator =     position
    denominator =   counterPart

    if diagonal % 2 == 1:
        numerator =     counterPart
        denominator =   position

    return f'{numerator}/{denominator}'

def solution():
    X = getInputs()

    diagonal, sum = getDiagonalAndSum(X)                # X번째 분수가 위치한 대각선 번호(diagonal)를 구합니다.
    position = getPositionOnDiagonal(X, diagonal, sum)  # X번째 분수의 대각선에서의 위치(position)를 구합니다.

    fraction = findFraction(diagonal, position)         # 대각선 번호와 위치에 해당하는 분수를 찾습니다.
    
    print(fraction)                                     # 찾은 분수를 출력합니다.


if __name__ == '__main__':
    solution()