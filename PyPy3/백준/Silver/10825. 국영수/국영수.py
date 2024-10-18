import sys
input = sys.stdin.readline

N = int(input())

student_scores = []

for _ in range(N):
    elems = input().split()
    student_scores.append((elems[0], int(elems[1]), int(elems[2]), int(elems[3])))

result = sorted(student_scores, key=lambda x: (-x[1], x[2], -x[3], x[0]))

for student_score in result:
    print(student_score[0])