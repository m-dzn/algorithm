# 브론즈 I > 부녀회장이 될테야
MAX_FLOOR = 14
MAX_UNIT = 14

def initResidentsOfApartment(maxFloor, maxUnit):
    apartment = [[0] * (MAX_UNIT + 1) for _ in range(MAX_FLOOR + 1)]
    apartment[0] = [unit for unit in range(MAX_UNIT + 1)]

    for floor in range(1, maxFloor + 1):
        for unit in range(1, maxUnit + 1):
            apartment[floor][unit] = apartment[floor][unit - 1] + apartment[floor - 1][unit]

    return apartment

apartment = initResidentsOfApartment(MAX_FLOOR, MAX_UNIT)

def getTestCaseInputs():
    k = int(input()) # k층
    n = int(input()) # n호

    return (k, n)

def getNumberOfResidents(k: int, n: str):
    return apartment[k][n]

if __name__ == "__main__":
    T = int(input())

    for t in range(T):
        k, n = getTestCaseInputs() # 아파트 k층, n호

        numberOfResidents = getNumberOfResidents(k, n)
        print(numberOfResidents)
