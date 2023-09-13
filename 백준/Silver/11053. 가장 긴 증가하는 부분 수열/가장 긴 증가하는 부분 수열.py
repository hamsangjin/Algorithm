import sys

# N
N = int(sys.stdin.readline().strip())

# 수열 A
A = list(map(int, sys.stdin.readline().strip().split()))

dp = [1] * N

for i in range(1, N):
  for j in range(i):
    if A[i] > A[j]:
      dp[i] = max(dp[i], dp[j]+1)

print(max(dp))