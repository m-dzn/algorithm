# Level1 > 연습문제 > 햄버거 만들기

hamburger = [1, 2, 3, 1]

def solution(ingredient):
    answer = 0
    
    stack = []
    
    for item in ingredient:
        stack.append(item)
        
        if (len(stack) >= 4):
            if isHamburger(stack):
                for i in range(4): stack.pop()
                answer = answer + 1
            
    return answer
    
def isHamburger(stack):
    return True if stack[-4:] == hamburger else False