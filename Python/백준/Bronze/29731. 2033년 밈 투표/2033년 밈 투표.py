import sys
input = sys.stdin.readline

N = int(input())

promises = [
    "Never gonna give you up",
    "Never gonna let you down",
    "Never gonna run around and desert you",
    "Never gonna make you cry",
    "Never gonna say goodbye",
    "Never gonna tell a lie and hurt you",
    "Never gonna stop"
]

for _ in range(N):
    line = input().strip()
    
    if line not in promises:
        print("Yes")
        exit()

print("No")