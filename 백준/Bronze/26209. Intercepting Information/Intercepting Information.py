import sys
a = list(map(int, sys.stdin.readline().strip().split()))
if 9 in a:
    print('F')
else:
    print('S')