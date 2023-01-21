# 실버 V > 좌표 정렬하기 2
N = int(input())

coordinates = [list(map(int, input().split(' '))) for x in range(N)]

coordinates.sort(key = lambda coordinate: (coordinate[1], coordinate[0]))

for coordinate in coordinates:
    print(f'{coordinate[0]} {coordinate[1]}')