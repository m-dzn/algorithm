def change_6_to_5(number):
    changed_number = number.replace("6", "5")
    return int(changed_number)
    
def change_5_to_6(number):
    changed_number = number.replace("5", "6")
    return int(changed_number)

# 입력
A, B = input().split()

# 처리
min_A = change_6_to_5(A)
min_B = change_6_to_5(B)

min = min_A + min_B

max_A = change_5_to_6(A)
max_B = change_5_to_6(B)

max = max_A + max_B

# 출력
print(min, max)
