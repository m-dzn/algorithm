import sys

input = sys.stdin.readline

def reverse_word(word):
    """단어를 뒤집는 함수"""
    return word[::-1]

def reverse(line):
    is_inside_tag = False
    result = []
    temp_word = []

    for ch in line:
        if ch == "<":
            if temp_word:
                reversed_word = reverse_word(''.join(temp_word))
                result.append(reversed_word)
                temp_word.clear()
                
            is_inside_tag = True
            result.append(ch)
        elif ch == ">":
            is_inside_tag = False
            result.append(ch)
        elif is_inside_tag:
            result.append(ch)
        elif ch == " ":
            reversed_word = reverse_word(''.join(temp_word))
            result.append(reversed_word)
            temp_word.clear()
            result.append(ch)
        else:
            temp_word.append(ch)

    result += temp_word[::-1]

    return ''.join(result)

# 입력
line = input().rstrip()

# 처리
reversed_word = reverse(line)

# 출력
print(reversed_word)