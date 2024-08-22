class ListNode:
    def __init__(self, val=0, prev=None):
        self.val = val
        self.prev = prev
        
    def set_prev(self, prev_node):
        prev_node.prev = self.prev
        self.prev = prev_node

N = int(input())

numbers_picked = list(map(int, input().split()))

root_node = ListNode(val=1)

last_node = root_node
for i in range(1, len(numbers_picked)):
    current_node = ListNode(val=i+1)

    number = numbers_picked[i]
    
    prev_node = last_node
    for j in range(number - 1):
        prev_node = prev_node.prev

    if number != 0:
        prev_node.set_prev(current_node)
    else:
        current_node.prev = last_node
        last_node = current_node

result = []
while last_node != None:
    result.insert(0, str(last_node.val))
    last_node = last_node.prev

print(' '.join(result))