countArray = [0 for i in range(26)]

word = input()
maxIndex = 0

for ch in word:
    index = ord(ch.lower()) - ord('a')
    countArray[index] += 1

    if countArray[maxIndex] < countArray[index]:
        maxIndex = index

mostFrequentChar = chr(ord('a') + maxIndex).upper()
numOfMaxChars = countArray.count(countArray[maxIndex])

answer = mostFrequentChar if numOfMaxChars == 1 else '?'

print(answer)
