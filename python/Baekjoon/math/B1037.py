# 브론즈 I > 약수
N = int(input())
divisorList = list(map(int, input().split(' ')))

divisorList.sort()
print(divisorList[0] * divisorList[-1])