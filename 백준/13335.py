# 트럭
from collections import deque
n, w, L = map(int, input().split())
truck = deque(map(int, input().split()))
bridge = deque([0 for _ in range(w)])
time = 0

while True:
    if truck:
        bridge.popleft()
        if sum(bridge) + truck[0] <= L:
            nt = truck.popleft()
            bridge.append(nt)
        else:
            bridge.append(0)
        time += 1
    else:
        break

time += w
print(time)