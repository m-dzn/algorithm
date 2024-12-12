X, Y = map(int, input().split())

##### 추상화 1단계 #####
def calc_Z(X, Y):
    return (100 * Y) // X

def find_min_rounds_to_adjust_z(X, Y):
    # 1단계 : 확률 구하기
    Z = calc_Z(X, Y)

    # 2단계 : 시행횟수를 늘려도 Z 확률이 변하지 않으면 -1 반환
    if Z >= 99:
        return -1

    # 3단계 : 포인터 초기화
    left_pointer = 0
    right_pointer = X

    # 4단계 : 시간초과를 피하기 위해 이분탐색 실시
    target = X
    
    while left_pointer <= right_pointer:
        mid = left_pointer + (right_pointer - left_pointer) //2

        new_Z = calc_Z(X + mid, Y + mid)

        if new_Z > Z:
            target = mid
            right_pointer = mid - 1
        else:
            left_pointer = mid + 1

    return target

##### 실행 #####
def main():
    # 1단계 : 몇 판 더 해야 Z가 변하는지 찾기
    min_rounds = find_min_rounds_to_adjust_z(X, Y)
    
    # 2단계 : 출력
    print(min_rounds)

main()