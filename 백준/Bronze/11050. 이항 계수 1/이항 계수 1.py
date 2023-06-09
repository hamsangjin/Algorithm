import sys

def factorial(n):
  if n == 0:
    return 1
  result = 1
  for i in range(1, n+1):
    result *= i
  return result

n, k = map(int, sys.stdin.readline().strip().split())

print(factorial(n) // (factorial(k) * factorial(n-k)))