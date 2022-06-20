import heapq
import sys

t = int(input())
hq = []
for i in range(t):
    num = list(map(int, sys.stdin.readline().split()))
    if num[0] == 0:
        if len(hq)!=0:
            print(heapq.heappop(hq)[1])
        else:
            print(-1)
    else:
        for j in range(1,num[0]+1):
            heapq.heappush(hq,(-num[j],num[j]))
