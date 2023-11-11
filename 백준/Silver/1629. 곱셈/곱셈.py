import sys

A, B, C = map(int, sys.stdin.readline().strip().split())

def cal(A, n):
  if n == 1:
    return A % C
  else:
    temp = cal(A, n // 2)
    if n % 2 == 0:
      return (temp * temp) % C
    else:
      return (temp * temp * A) % C
    
print(cal(A, B))