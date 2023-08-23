import sys

N = int(sys.stdin.readline().strip())
M = sys.stdin.readline().strip()

for i in range(2, -1, -1):
  print(int(M[i]) * N)

print(N * int(M))