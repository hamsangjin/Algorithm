import sys

for _ in range(int(sys.stdin.readline().strip())):
  a = list(map(int, sys.stdin.readline().strip().split()))
  
  if a[0]*a[1] > a[2]*a[3]:
    print('TelecomParisTech')
  elif a[0]*a[1] < a[2]*a[3]:
    print('Eurecom')
  else:
    print('Tie')