# 실버 IV > 덱
import sys
from collections import deque
from enum import Enum, auto
from typing import List, Union

def get_command() -> Union[str, int]:
    line: List[str] = sys.stdin.readline().split()

    if (len(line) == 2):
        return line[0], int(line[1])
    
    return line[0], -1

class StrEnum(str, Enum):
    def _generate_next_value_(name, start, count, last_values):
        return name
    
    def __str__(self):
        return self.name

class Command(StrEnum):
    push_front =    auto()
    push_back =     auto()
    pop_front =     auto()
    pop_back =      auto()
    size =          auto()
    empty =         auto()
    front =         auto()
    back =          auto()

class Deque:
    deque = deque()
    
    def enter_command(self, command: str, number: int):
        if (command == Command.push_front):
            self.push_front(number)
        if (command == Command.push_back):
            self.push_back(number)
        if (command == Command.pop_front):
            self.pop_front()
        if (command == Command.pop_back):
            self.pop_back()
        if (command == Command.size):
            self.size()
        if (command == Command.empty):
            self.empty()
        if (command == Command.front):
            self.front()
        if (command == Command.back):
            self.back()
    
    # Command methods
    def push_front(self, number: int):
        self.deque.appendleft(number)
    
    def push_back(self, number: int):
        self.deque.append(number)
    
    def pop_front(self):
        if not self.isEmpty():
            number = self.deque.popleft()
            print(number)
    
    def pop_back(self):
        if not self.isEmpty():
            number = self.deque.pop()
            print(number)
    
    def size(self):
        size = len(self.deque)
        print(size)
    
    def empty(self):
        size = len(self.deque)
        is_empty = 1 if size == 0 else 0
        print(is_empty)
    
    def front(self):
        if not self.isEmpty():
            print(self.deque[0])
    
    def back(self):
        if not self.isEmpty():
            print(self.deque[-1])

    def isEmpty(self):
        size = len(self.deque)
        if size == 0:
            print(-1)
            return True
        return False

if __name__ == '__main__':
    N = int(input())

    deque = Deque()

    for _ in range(N):
        command, position = get_command()
        deque.enter_command(command, position)
