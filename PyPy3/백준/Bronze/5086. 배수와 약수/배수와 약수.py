while True:
    line = input()

    if line == '0 0':
        break
    
    A, B = map(int, line.split())
    
    if B % A == 0:
        print('factor')
    elif A % B == 0:
        print('multiple')
    else:
        print('neither')