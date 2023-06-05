import sys

n1 = list(map(int, sys.stdin.readline().strip().split()))

if (n1[1] - 45) < 0:
  if n1[0] == 0:
    n1[0] = 23
    n1[1] = 60 + (n1[1] - 45)
  else:
    n1[0] = n1[0] - 1
    n1[1] = 60 + (n1[1] - 45)
else:
  n1[1] = n1[1] - 45

print(n1[0], n1[1])