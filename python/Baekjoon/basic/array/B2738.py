# 브론즈 V > 행렬 덧셈
N, M = list(map(int, input().split(' ')))

def getMatrix(N):
    return [list(map(int, input().split(' '))) for x in range(N)]

def sumAndPrintMatrix(A, B):
    newMatrix = [[0 for x in range(M)] for x in range(N)]

    for row in range(N):
        for col in range(M):
            newMatrix[row][col] = A[row][col] + B[row][col]

        printIntRow(newMatrix[row])
    
    return newMatrix

def printIntRow(row):
    print(" ".join(map(str, row)))

A = getMatrix(N)
B = getMatrix(N)

sumAndPrintMatrix(A, B)