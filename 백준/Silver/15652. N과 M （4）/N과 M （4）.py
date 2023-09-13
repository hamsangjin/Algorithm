import sys

def DFS(start):
  if len(seq) == M:
    print(' '.join(map(str, seq)))
    return

  for i in range(start, N+1):  
    seq.append(i)              
    DFS(i) 
    seq.pop()

# N, M
N, M = map(int, sys.stdin.readline().strip().split())

seq = []

DFS(1)