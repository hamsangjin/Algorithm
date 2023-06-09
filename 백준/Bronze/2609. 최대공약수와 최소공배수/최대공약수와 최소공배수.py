import sys

n, m = map(int, sys.stdin.readline().strip().split())
i, j = n, m

mod = 0
if n > m:
  while(m != 0):
    mod = n % m
    n = m
    m = mod
  print(n)
  print(int(i*j/n))
else:
  while(n != 0):
    mod = m % n
    m = n
    n = mod
  print(m)
  print(int(i*j/m))