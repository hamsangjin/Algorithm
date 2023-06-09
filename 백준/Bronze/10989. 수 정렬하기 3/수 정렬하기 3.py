import sys

n = int(sys.stdin.readline().strip())

result = [0] * 10001
for i in range(n):
  num = int(sys.stdin.readline().strip())
  result[num] += 1

for i in range(10001):
  if result[i] != 0:
    for j in range(result[i]):
      print(i)