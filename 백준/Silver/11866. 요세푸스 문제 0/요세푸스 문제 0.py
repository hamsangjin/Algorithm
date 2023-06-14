import sys

n, k = map(int, sys.stdin.readline().strip().split())

nums = list(range(1, n+1))
c = 0
result = []

while len(nums) > 0:
  c = (c + (k-1)) % len(nums)
  result.append(str(nums.pop(c)))

print("<%s>" %(", ".join(result)))