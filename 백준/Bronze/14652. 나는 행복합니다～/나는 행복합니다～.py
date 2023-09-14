import sys

# N, M, K
N, M, K = map(int, sys.stdin.readline().strip().split())

print(K // M, K % M)