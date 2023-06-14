import sys

N = int(sys.stdin.readline().strip())
A = set(map(int, sys.stdin.readline().strip().split()))
M = int(sys.stdin.readline().strip())
MS = list(map(int, sys.stdin.readline().strip().split()))

for m in MS:
  if m in A:
    print(1)
  else:
    print(0)