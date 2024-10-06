N = int(input())
call_times = list(map(int, input().split()))

# 영식 요금제
y_price = sum(list(map(lambda x: ((x + 1) // 30 + 1) * 10, call_times)))

# 민식 요금제
m_price = sum(list(map(lambda y: ((y + 1) // 60 + 1) * 15, call_times)))

if y_price > m_price:
    print("M", m_price)
elif m_price > y_price:
    print("Y", y_price)
else:
    print("Y", "M", m_price)