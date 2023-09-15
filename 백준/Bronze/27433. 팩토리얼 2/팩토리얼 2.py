import sys

# N
N = int(sys.stdin.readline().strip())

ans = 1
for i in range(1, N+1):
  ans *= i
print(ans)