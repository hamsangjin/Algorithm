import sys
import math

n = int(sys.stdin.readline().strip())

cnt = 0
for i in reversed(str(math.factorial(n))):
  if i != '0':
    break
  cnt += 1

print(cnt)