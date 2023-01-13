# 실버 V > 단어 정렬
N = int(input())
words = list(set([input() for x in range(N)]))

words.sort(key = lambda x: (len(x), x))

print('\n'.join(words))