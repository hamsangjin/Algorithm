import sys

chess = [1, 1, 2, 2, 2, 8]

found = list(map(int, sys.stdin.readline().strip().split()))

for i in range(6):
    print((chess[i] - found[i]), end=' ')