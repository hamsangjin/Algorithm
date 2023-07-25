import sys

A, B, C =  map(int, sys.stdin.readline().strip().split())

print((A+B)%C)
print(((A%C) + (B%C))%C)
print((A*B)%C)
print(((A%C) * (B%C))%C)