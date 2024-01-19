import sys

N = int(sys.stdin.readline().strip())
tree = {}

EMPTY_NODE = '.'

for n in range(N):
    root, left, right = sys.stdin.readline().strip().split()
    tree[root] = [left, right]


# 재귀함수로 구현
def preorder(root):
    if root != EMPTY_NODE:
        print(root, end='')         # root
        preorder(tree[root][0])     # left
        preorder(tree[root][1])     # right


def inorder(root):
    if root != '.':
        inorder(tree[root][0])      # left
        print(root, end='')         # root
        inorder(tree[root][1])      # right


def postorder(root):
    if root != '.':
        postorder(tree[root][0])    # left
        postorder(tree[root][1])    # right
        print(root, end='')         # root


if __name__ == '__main__':
    FIRST_NODE = 'A'
    preorder(FIRST_NODE)
    print()
    inorder(FIRST_NODE)
    print()
    postorder(FIRST_NODE)