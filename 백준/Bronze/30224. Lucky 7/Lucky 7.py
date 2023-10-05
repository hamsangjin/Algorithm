import sys

N = int(sys.stdin.readline().strip())

if '7' not in str(N) and N % 7 != 0:
  print(0)
elif '7' not in str(N) and N % 7 == 0:
  print(1)
elif '7' in str(N) and N % 7 != 0:
  print(2)
elif '7' in str(N) and N % 7 == 0:
  print(3)