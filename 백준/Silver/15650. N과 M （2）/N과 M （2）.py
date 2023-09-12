import sys

def DFS(start):
  if len(seq) == M:
    print(' '.join(map(str, seq)))
    return
  
  for i in range(start, N+1):
    if i not in seq:
      seq.append(i)
      DFS(i+1)
      seq.pop()

# N, M
N, M = map(int, sys.stdin.readline().strip().split())

seq = []

DFS(1)