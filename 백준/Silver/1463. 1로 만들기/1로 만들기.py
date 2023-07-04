import sys
from collections import deque

X = int(sys.stdin.readline().strip())

L = 0
Q = deque([X])
flag = False
while Q:
    n = len(Q)
    for _ in range(n):
        v = Q.popleft()
        if v == 1:
            flag = True
            print(L)
            break

        v_2, v_3 = (v%2 == 0), (v%3 == 0)
        if v_3:
            Q.append(v//3)
        if v_2:
            Q.append(v//2)
        
        Q.append(v-1)
    if flag:
        break
    L += 1