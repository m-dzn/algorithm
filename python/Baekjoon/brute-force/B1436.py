# 실버 V > 영화감독 숌
import sys

def readline():
    return sys.stdin.readline()

if __name__ == '__main__':
    N = int(readline())

    count = 0
    number = 665
    while count < N:
        number += 1
        if ("666" in str(number)):
            count += 1
    
    print(number)