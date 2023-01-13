# 브론즈 V > 과제 안 내신 분..?
attendance = [False for i in range(31)]

for i in range(30 - 2):
    student_number = int(input())
    attendance[student_number] = True

for i in range(1, 31):
    if (not attendance[i]): print(i)