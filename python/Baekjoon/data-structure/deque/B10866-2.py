# 실버 IV > 덱
import sys
from enum import Enum, auto

def readline() -> str:
    return sys.stdin.readline().rstrip()

def get_command() -> str:
    return readline()

class Deque:
    deck = []

    def __init__(self):
        self.command_dictionary = {
            "push_front": lambda number: self.deck.insert(0, number),
            "push_back": lambda number: self.deck.append(number),
            "pop_front": lambda: self.deck.pop(0) if self.deck else -1,
            "pop_back": lambda: self.deck.pop() if self.deck else -1,
            "size": lambda: len(self.deck),
            "empty": lambda: +(not self.deck),
            "front": lambda: self.deck[0] if self.deck else -1,
            "back": lambda: self.deck[-1] if self.deck else -1,
        }

    def enter_command(self, line: str):
        if "push" in line:
            command, number = self.getCommandAndNumber(line)
            self.command_dictionary[command](number)
        else:
            result = self.command_dictionary[line]()
            print(result)
    
    def getCommandAndNumber(self, line: str):
        command, numberStr = line.split()
        return command, int(numberStr)

if __name__ == '__main__':
    N = int(readline())

    deque = Deque()
    for _ in range(N):
        command = get_command()
        deque.enter_command(command)
