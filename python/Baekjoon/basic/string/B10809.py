# 브론즈 V > 알파벳 찾기
S = input()

alphabetPosition = [-1 for x in range(26)]

def getIntChar(ch):
    return ord(ch) - ord('a')

def saveAlphabetPosition(ch, position):
    intChar = getIntChar(ch)

    if (alphabetPosition[intChar] == -1):
        alphabetPosition[intChar] = position

for i in range(len(S)):
    ch = S[i]
    saveAlphabetPosition(ch, i)

strAlphabetPosition = list(map(str, alphabetPosition))
print(' '.join(strAlphabetPosition))