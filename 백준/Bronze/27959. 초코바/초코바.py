import sys

coin, choco = map(int, sys.stdin.readline().strip().split())

if (coin * 100) >= choco:
    print('Yes')
else:
    print('No')