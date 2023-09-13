import sys

def DFS(start):
  if len(seq) == M:
    print(*seq)
    return

  for i in range(start, N):
    seq.append(nums[i])            
    DFS(i)
    seq.pop()

# N, M
N, M = map(int, sys.stdin.readline().strip().split())

# N개의 수
nums = sorted(list(map(int, sys.stdin.readline().strip().split())))
seq = []

DFS(0)