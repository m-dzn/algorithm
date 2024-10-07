# 입력
word = list(input())
answer = []
new_words = []

# 처리
for i in range(1, len(word) - 1):
    for j in range(i + 1, len(word)):
        part1 = word[:i]
        part2 = word[i:j]
        part3 = word[j:]

        part1.reverse()
        part2.reverse()
        part3.reverse()

        new_words.append(part1 + part2 + part3)

for i in range(len(new_words)):
    new_words[i] = ''.join(new_words[i])

first_word = sorted(new_words)[0]

# 출력
print(first_word)