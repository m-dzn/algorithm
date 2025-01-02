import sys
input = sys.stdin.readline

NUM_OF_DWARFS = 9
NUM_OF_DWARFS_OF_PRINCESS = 7

# 준비
dwarfs = []


# 데이터 전처리
for _ in range(NUM_OF_DWARFS):
    height = int(input().rstrip())
    dwarfs.append(height)

# 비즈니스 로직
seven_dwarf_candidates = []
def dfs(depth, start):
    if depth == NUM_OF_DWARFS_OF_PRINCESS:
        if sum(seven_dwarf_candidates) != 100: return
            
        for i in sorted(seven_dwarf_candidates):
            print(i)
        exit()

    for dwarf_index in range(start, len(dwarfs)):
        seven_dwarf_candidates.append(dwarfs[dwarf_index])
        dfs(depth + 1, dwarf_index + 1)
        seven_dwarf_candidates.pop()

dfs(0, 0)