import sys

def DFS(start):
  if len(seq) == M:
    print(' '.join(map(str, seq)))
    return

  for i in range(start, len(nums)): 
    if nums[i] not in seq:
      seq.append(nums[i])             
      DFS(start)
      seq.pop()

# N, M
N, M = map(int, sys.stdin.readline().strip().split())

# N개의 수
nums = sorted(list(map(int, sys.stdin.readline().strip().split())))

seq = []

DFS(0)