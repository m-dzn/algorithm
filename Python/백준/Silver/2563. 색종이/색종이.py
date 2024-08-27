# 상수
MATRIX_SIZE = 100
COLORED_PAPER_SIZE = 10

# 변수
matrix = [[0] * (MATRIX_SIZE + 1) for _ in range(MATRIX_SIZE + 1)]

# 로직
def draw_colored_paper(x, y):
    for i in range(x, x + COLORED_PAPER_SIZE):
        for j in range(y, y + COLORED_PAPER_SIZE):
            matrix[i][j] = 1

def calc_total_area():
    count = 0

    for row in matrix:
        for col in row:
            if col == 1:
                count += 1
    
    return count

# 입력
n = int(input())

for _ in range(n):
    x, y = map(int, input().split())
    draw_colored_paper(x, y)

# 처리
total_area = calc_total_area()

# 출력
print(total_area)
