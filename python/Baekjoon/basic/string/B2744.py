# 브론즈 V > 대소문자 바꾸기
word = input()

reverseWord = ""

for ch in word:
    reverseWord += ch.lower() if ch.isupper() else ch.upper()

print(reverseWord)