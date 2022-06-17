t = int(input())
num = list(map(int,input().split()))
result = []

for i in range(t):
    result.insert(i-num[i],i+1)

print(*result)