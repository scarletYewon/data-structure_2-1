#영역 구하기
import sys
sys.setrecursionlimit(10000)

dx = [-1,1,0,0] #상하좌우
dy = [0,0,1,-1]
result = []
count = 0 #영역의 개수
cnt = 1 #dfs용

#기본
M,N,K = map(int,sys.stdin.readline().split())
zido = [[-1]*N for _ in range(M)]
for i in range(K):
    ax,ay,bx,by = map(int,sys.stdin.readline().split())
    for j in range(ay,by): #M
        for k in range(ax,bx): #N
            zido[j][k] = 0

#dfs
def dfs(y,x):
    global cnt
    zido[y][x] = 0
    for i in range(4):
        ny = y + dy[i]
        nx = x + dx[i]
        if 0<=ny<M and 0<=nx<N and zido[ny][nx] == -1: #범위체크
            cnt+=1 #한칸플러스
            dfs(ny,nx)

for i in range(M): #y
    for j in range(N): #x
        if zido[i][j] == -1:
            count +=1 #영역개수추가
            dfs(i,j)
            result.append(cnt) #넓이 어펜드
            cnt = 1 #초기화

print(count) #영역의 개수
result.sort() #결과정렬
print(*result)