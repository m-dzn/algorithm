from collections import deque

# 준비
remaining_employees = {}
overtime_worker_count = 0

# 입력
q = int(input())

for _ in range(q):
    name, symbol = input().split()

    if name in remaining_employees:
        employee_count = remaining_employees[name]
        
        if employee_count > 0:
            remaining_employees[name] += 1 if symbol == '+' else -1                
        else:
            if symbol == '+':
                remaining_employees[name] += 1
            else:
                overtime_worker_count += 1
    else:
        if symbol == '+':
            remaining_employees[name] = 1
        else:
            overtime_worker_count += 1

overtime_worker_returned_home = overtime_worker_count
overtime_worker_still_working = sum(remaining_employees.values())

overtime_worker_total = overtime_worker_returned_home + overtime_worker_still_working

print(overtime_worker_total)