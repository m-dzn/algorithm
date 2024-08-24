board = input()

board = board.replace("XXXX", "AAAA")
board = board.replace("XX", "BB")

if ("X" in board):
    board = "-1"

print(board)