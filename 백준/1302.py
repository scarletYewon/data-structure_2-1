import sys
t = int(input())
bkd = dict()
for i in range(t):
    book_name = sys.stdin.readline().strip()
    if book_name in bkd:
        bkd[book_name] +=1
    else:
        bkd[book_name] = 1

result=[]
num = max(bkd.values())

for key, value in bkd.items():
    if value == num:
        result += [key]

result.sort()
print(result[0])