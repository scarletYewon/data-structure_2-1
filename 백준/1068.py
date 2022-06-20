# 트리
import sys

n = int(input())
arr = list(map(int,sys.stdin.readline().split()))
erase = int(input())
cnt = 0
tree = [[] for _ in range(n)]

for i in range(n):
    tree[i] = arr[i]

tree[erase] = -2

def remove(erase):
    tree[erase] = -2
    for i in range(n):
        if arr[i] == erase:
            tree[i] = -2
            remove(i)

remove(erase)

for i in range(n):
    if tree[i] != -2 and i not in tree:
        cnt+=1

print(cnt)