# 최소비용 구하기
import sys
from heapq import heappush,heappop
INF = sys.maxsize

#기본
N = int(sys.stdin.readline())
M = int(sys.stdin.readline())
bus = [[] for i in range(N+1)]
distance = [INF]*(N+1)

#받을거
for i in range(M):
    start, end, cost = map(int,sys.stdin.readline().split())
    bus[start].append((end,cost))

#다익스트라
def dijkstra(sta):
    distance[sta] = 0
    q = [(0,sta)]
    while q:
        w,id = heappop(q)
        if distance[id] < w:
            continue
        for a,b in bus[id]:
            if distance[a] > w+b:
                distance[a] = w+b
                heappush(q,(w+b,a))
    return distance[en]

#마지막한줄
sta,en = map(int,sys.stdin.readline().split())
print(dijkstra(sta))