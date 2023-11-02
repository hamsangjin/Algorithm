import sys
from collections import deque, defaultdict

A, B = map(int, sys.stdin.readline().strip().split())

Q = deque()
Q.append(A)

ch = defaultdict(int)
ch[A] = 1
L = 1
flag = True

while(flag):
  length = len(Q)
  if length == 0:
    print(-1)
    break
  
  for _ in range(length):
    x = Q.popleft()

    if x == B:
      print(L)
      flag = False
      break
  
    for nx in [x*2, int(str(x) + '1')]:
      if ch[nx] == 0 and B >= nx:
        Q.append(nx)
        ch[nx] = 1

  L += 1