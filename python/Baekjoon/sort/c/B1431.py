# 실버 3 > 시리얼 번호
N = int(input())
serialNumbers = [input() for x in range(N)]

def sum_num(serialNumber):
    sum = 0

    for ch in serialNumber:
        if ch.isdigit(): sum += int(ch)
    
    return sum

serialNumbers.sort(key = lambda x: (len(x), sum_num(x), x))

print('\n'.join(serialNumbers))