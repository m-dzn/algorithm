# 브론즈 II > 음계
import sys

numbers = list(map(int, sys.stdin.readline().split()))

startDiff = numbers[1] - numbers[0]
message = ''
for index in range(2, len(numbers)):
    diff = (numbers[index] - numbers[index - 1])

    if startDiff != diff:
        message = 'mixed'
        break

if not message:
    message = 'ascending' if startDiff == 1 else 'descending'

print(message)