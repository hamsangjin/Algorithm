import sys

x = len(sys.stdin.readline().strip())
y = len(sys.stdin.readline().strip())

if x >= y:
    print('go')
else:
    print('no')