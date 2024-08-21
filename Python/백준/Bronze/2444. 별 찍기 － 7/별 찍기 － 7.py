N = int(input())

num_of_lines = 2 * N - 1
star_string = []

for i in range(num_of_lines):
    adjusted_i = i if i < N else num_of_lines - 1 - i
    line = " " * (N - 1 - adjusted_i) + "*" * (2 * adjusted_i + 1)
    print(line)