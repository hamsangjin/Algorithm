import sys

N = int(sys.stdin.readline().strip())

sum = 0
for i in range(1, N+1):
  sum += i

print(sum)

print(sum**2)

sum = 0
for i in range(1, N+1):
  sum += (i**3)

print(sum)
