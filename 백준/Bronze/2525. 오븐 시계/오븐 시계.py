import sys

H, M = map(int, sys.stdin.readline().strip().split())

cook = int(sys.stdin.readline().strip())

if (M + cook) >= 60:
  H += (M + cook) // 60
  M = (M + cook) % 60
else:
  M += cook

if H > 23:
  H -= 24

print(H, M)