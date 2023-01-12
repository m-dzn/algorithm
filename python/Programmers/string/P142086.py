# Level1 > 연습문제 > 가장 가까운 같은 글자

def solution(s):
    answer = []
    dic = {}
    
    for i in range(len(s)):
        character = s[i]

        answer.append(-1 if character not in dic else i - dic[character])
        dic[character] = i
        
    return answer