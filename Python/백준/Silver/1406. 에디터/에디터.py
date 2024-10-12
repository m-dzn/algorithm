import sys
input = sys.stdin.readline

class Editor:
    def __init__(self, text):
        self.l_stack = list(text)
        self.r_stack = []

    def move_to_left(self):
        if len(self.l_stack) > 0:
            elem = self.l_stack.pop()
            self.r_stack.append(elem)

    def move_to_right(self):
        if len(self.r_stack) > 0:
            elem = self.r_stack.pop()
            self.l_stack.append(elem)

    def delete(self):
        if len(self.l_stack) > 0:
            self.l_stack.pop()

    def add(self, character):
        self.l_stack.append(character)

    def print(self):
        return ''.join(self.l_stack + list(reversed(self.r_stack)))

# 입력
init_text = input().strip()
editor = Editor(init_text)

M = int(input())

# 처리
for _ in range(M):
    commands = input().split()

    if commands[0] == 'L':
        editor.move_to_left()
    elif commands[0] == 'D':
        editor.move_to_right()
    elif commands[0] == 'B':
        editor.delete()
    elif commands[0] == 'P':
        editor.add(commands[1])

# 출력
print(editor.print())