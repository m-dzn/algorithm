# 실버 IV > 제로
def getNumberInput():
    return int(input())

def pushNumberIfCorrect(stack, number):
    if (number != 0):   stack.append(number)
    else:               stack.pop()

if __name__ == '__main__':
    K = getNumberInput()

    correctNumbers = []

    for k in range(K):
        number = getNumberInput()
        pushNumberIfCorrect(correctNumbers, number)
    
    print(sum(correctNumbers))