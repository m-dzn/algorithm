# 준비
x_dict = {}
y_dict = {}

# 입력
for _ in range(3):
  x, y = map(int, input().split())
  if (x in x_dict):
    del (x_dict[x])
  else:
    x_dict[x] = True

  if (y in y_dict):
    del (y_dict[y])
  else:
    y_dict[y] = True

# 출력
x = list(x_dict.keys())[0]
y = list(y_dict.keys())[0]
print(x, y)
