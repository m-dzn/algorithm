# 브론즈 III > 직사각형에서 탈출
x, y, w, h = list(map(int, input().split(' ')))

min_width = min(x, w - x)
min_height = min(y, h - y)

min_distance = min(min_width, min_height)

print(min_distance)