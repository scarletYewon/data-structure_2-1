# stack
import sys
t = int(input())
for i in range(t):
    word = list(sys.stdin.readline().rstrip())
    right = []
    left = []
    for j in word:
        if j == '-':
            if left:
                left.pop()
        elif j == '<':
            if left:
                right.append(left.pop())
        elif j == '>':
            if right:
                left.append(right.pop())
        else:
            left.append(j)
    right = reversed(right)
    print("".join(left)+"".join(right))