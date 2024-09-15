from collections import deque
import sys

input = sys.stdin.read
class B10845:
    def __init__(self):
        self.queue = deque()
        self.sb = []

    def execute(self, command):
        if command[0] == "push":
            self.queue.append(command[1])
        elif command[0] == "pop":
            self.sb.append(self.pop())
        elif command[0] == "size":
            self.sb.append(str(len(self.queue)))
        elif command[0] == "empty":
            self.sb.append(str(self.isEmpty()))
        elif command[0] == "front":
            self.sb.append(self.front())
        elif command[0] == "back":
            self.sb.append(self.back())

    def pop(self):
        if self.queue:
            return self.queue.popleft()
        else:
            return "-1"

    def isEmpty(self):
        return "1" if not self.queue else "0"

    def front(self):
        if self.queue:
            return self.queue[0]
        else:
            return "-1"

    def back(self):
        if self.queue:
            return self.queue[-1]
        else:
            return "-1"

    def print(self):
        sys.stdout.write("\n".join(self.sb) + "\n")


def main():
    b = B10845()
    commands = input().splitlines()
    N = int(commands[0])
    
    for i in range(1, N + 1):
        b.execute(commands[i].split())

    b.print()


if __name__ == "__main__":
    main()
