import sys
from collections import deque

# 테스트 케이스 T
T = int(sys.stdin.readline().strip())

for _ in range(T):
  cmds = list(map(str, sys.stdin.readline().strip()))
  n = int(sys.stdin.readline().strip())
  x_list = deque(sys.stdin.readline().strip()[1:-1].split(','))
  
  if n == 0:
    x_list = deque()
    
  rev = 0

  try:
    for cmd in cmds:
      # R
      if cmd == 'R':
        rev += 1
      # D
      else:
        if rev % 2 == 0:
          x_list.popleft()
        else:
          x_list.pop()

    if rev % 2 == 0:
      print("["+",".join(x_list)+"]")
    else:
      x_list.reverse()
      print("["+",".join(x_list)+"]")

  except:
    print("error")
    continue