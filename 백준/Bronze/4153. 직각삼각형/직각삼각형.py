import sys
import math

t = []

for i in range(30000):
  t = sorted(list(map(int, sys.stdin.readline().strip().split())))
  if sum(t) == 0:
    break
  else:
    if (math.pow(t[0], 2) + math.pow(t[1], 2)) == math.pow(t[2], 2):
      print('right')
    else:
      print('wrong')