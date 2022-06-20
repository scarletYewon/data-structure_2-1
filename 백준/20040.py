import sys

n,m = map(int,sys.stdin.readline().split())
parent = [i for i in range(n)]
result = 0

def find(a):
    if a == parent[a]:
        return a
    else:
        b = find(parent[a])
        parent[a] = b
        return b

for i in range(m):
    a, b = map(int,sys.stdin.readline().split())
    a = find(a)
    b = find(b)
    if a!=b:
        parent[max(a,b)] = min(a,b)
    else:
        if result == 0:
            result = i+1

print(result)