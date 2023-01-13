# 브론즈 V > 학점계산
grade = input()

gradeDictionary = {
    'A': 4.0,
    'B': 3.0,
    'C': 2.0,
    'D': 1.0,
    'F': 0.0
}

scoreSignDictionary = {
    '+': 0.3,
    '0': 0,
    '-': -0.3,
    '': 0
}

score = gradeDictionary[grade[0]]

if (len(grade) > 1):
    score += scoreSignDictionary[grade[1]]
    
print(score)