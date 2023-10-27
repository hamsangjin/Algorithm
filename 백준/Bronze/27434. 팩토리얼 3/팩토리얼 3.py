import sys

sum = 1
for i in range(1, int(sys.stdin.readline()) + 1):
  sum *= i

print(sum)