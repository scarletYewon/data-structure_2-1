L = int(input())
sp = input()
r = 31
M = 1234567891
rst = 0

for i in range(L):
    rst += (ord(sp[i])-96) * (r**i)

print(rst % M)