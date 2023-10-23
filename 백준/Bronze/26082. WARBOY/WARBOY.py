import sys

a, b, c = map(int, sys.stdin.readline().strip().split())

print(int(((b/a) * 3) * c))