import sys
from collections import deque

T = int(sys.stdin.readline().strip())

for _ in range(T):
    n = int(sys.stdin.readline().strip())
    
    Q = deque([1, 2, 3])
    cnt = 0
    while Q:
        length = len(Q)
        for _ in range(length):
            v = Q.popleft()
            if v == n:
                cnt += 1
                continue
            for nv in [1, 2, 3]:
                tmp = v + nv
                if tmp <= n:
                    Q.append(tmp)
    print(cnt)