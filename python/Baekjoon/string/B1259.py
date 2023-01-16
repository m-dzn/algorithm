# 브론즈 I > 팰린드롬수
answer = ""

def isPalindrome(str):
    halfIndex = len(str) // 2

    for i in range(halfIndex + 1):
        if str[i] != str[-(i + 1)]: return False

    return True

while True:
    str = input()

    if str == '0':     break
    else:               answer += 'yes' if isPalindrome(str) else 'no'
    answer += '\n'

print(answer)