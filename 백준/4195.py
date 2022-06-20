#친구 네트워크
import sys
input = sys.stdin.readline
sys.setrecursionlimit(10000)

def find(x):
    r = x
    while(parent[x]!= x):
        x = parent[x]
    while(parent[r] != x):
        z = parent[r]
        parent[r] = x
        r = z
    return x

def union(x,y):
    x = find(x)
    y = find(y)
    if x != y:
        parent[y] = x
        cnt[x] += cnt[y]
    return cnt[x]

t = int(input())
for _ in range(t):
    F = int(input())
    parent = dict()
    cnt = dict()
    for j in range(F):
        n1, n2 = input().split()
        if n1 not in parent:
            parent[n1] = n1
            cnt[n1] = 1
        if n2 not in parent:
            parent[n2] = n2
            cnt[n2] = 1
        print(union(n1,n2))

