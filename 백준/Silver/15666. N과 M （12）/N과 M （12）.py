import sys

_, M = map(int, sys.stdin.readline().strip().split())

nums = sorted(set(list(map(int, sys.stdin.readline().strip().split()))))

output = []

def dfs(start):
  if len(output) == M:
    print(*output)
    return

  for i in range(start, len(nums)):
    output.append(nums[i])
    dfs(i)
    output.pop()

dfs(0)