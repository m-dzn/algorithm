# 실버 IV > 체스판 다시 칠하기
CHESS_BOARD_SIZE = dict(X = 8, Y = 8)
NUM_OF_CHESS_BOARD_BLOCKS = CHESS_BOARD_SIZE['X'] * CHESS_BOARD_SIZE['Y']

def getInputs():
    N, M = list(map(int, input().split(' ')))

    lines = [input() for _ in range(N)]

    board = [[lines[y][x] for y in range(N)] for x in range(M)]

    return (N, M, board)

def isToBeRepainted(currentColor, x, y):
    correctColor = 'W' if (x + y) % 2 == 0 else 'B'
    return currentColor != correctColor

def countCellsToBeRepainted(board, startX, startY):
    countWStart = 0

    for y in range(CHESS_BOARD_SIZE['Y']): 
        for x in range(CHESS_BOARD_SIZE['X']):
            currentColor = board[x + startX][y + startY]
            if (isToBeRepainted(currentColor, x, y)): countWStart += 1

    countBStart = NUM_OF_CHESS_BOARD_BLOCKS - countWStart

    return min(countWStart, countBStart)

if __name__ == "__main__":
    N, M, board = getInputs()

    minCount = NUM_OF_CHESS_BOARD_BLOCKS

    for startX in range(M - CHESS_BOARD_SIZE['X'] + 1):
        for startY in range(N - CHESS_BOARD_SIZE['Y'] + 1):
            count = countCellsToBeRepainted(board, startX, startY)

            if (minCount > count): minCount = count

    print(minCount)
