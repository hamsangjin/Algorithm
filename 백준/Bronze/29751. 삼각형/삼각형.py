import sys

W, H = map(int, sys.stdin.readline().strip().split())

print(round((W * H) / 2, 1))