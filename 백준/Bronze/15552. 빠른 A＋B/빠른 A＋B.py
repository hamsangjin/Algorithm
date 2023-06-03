import sys
T = int(input())
result = []
for i in range(T):
    n, m= map(int, sys.stdin.readline().split())
    print(n+m)