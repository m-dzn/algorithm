# 자료 준비
credit_sum = 0
credit_grade_sum = 0

GRADE_DICT = {"A+": 4.5, "A0": 4.0, "B+": 3.5, "B0": 3.0, "C+": 2.5, "C0": 2.0, "D+": 1.5, "D0": 1.0, "F": 0.0}

# 입력
for _ in range(20):
    subject, credit, grade = input().split()

    if grade != "P":
        credit_sum += float(credit)
        credit_grade_sum += float(credit) * GRADE_DICT[grade]

# 출력
print(credit_grade_sum / credit_sum)