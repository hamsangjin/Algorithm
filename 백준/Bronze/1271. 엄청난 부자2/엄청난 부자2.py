import sys

n, m = map(int, sys.stdin.readline().strip().split())

print(n//m)
print(n%m)