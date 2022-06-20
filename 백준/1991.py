# 트리 순회
import sys

t = int(input())
tree = {}
for i in range(t):
    rt, left, right = sys.stdin.readline().strip().split()
    tree[rt] = [left,right]

#rt/left/right
def preorder(rt):
    if rt != '.':
        print(rt, end='')
        preorder(tree[rt][0])
        preorder(tree[rt][1])

#left/rt/right
def inorder(rt):
    if rt != '.':
        inorder(tree[rt][0])
        print(rt, end='')
        inorder(tree[rt][1])

#left/right/rt
def postorder(rt):
    if rt != '.':
        postorder(tree[rt][0])
        postorder(tree[rt][1])
        print(rt, end='')

preorder('A')
print()
inorder('A')
print()
postorder('A')


    