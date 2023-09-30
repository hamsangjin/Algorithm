import sys

N = list(map(int, sys.stdin.readline().strip().split()))

print(int((N[0]+1)*(N[1]+1)/(N[2]+1)-1))