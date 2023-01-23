# 브론즈 II > 문자열 반복
import sys

def readline():
    return sys.stdin.readline().rstrip()

def getRepeatAndString():
    R, S = readline().split()
    return int(R), S

def getRepeatedString(repeat: int, string: str) -> str:
    repeatedString = ''
    for ch in string:
        repeatedString += ch * repeat
    
    return repeatedString

if __name__ == '__main__':
    T = int(readline())

    for t in range(T):
        repeat, string = getRepeatAndString()
        repeatedString = getRepeatedString(repeat, string)
        print(repeatedString)
