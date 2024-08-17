A, B = list(map(int, input().split(" ")))

result = ">"
if A == B:
    result = "=="
elif A < B:
    result = "<"
    
print(result)