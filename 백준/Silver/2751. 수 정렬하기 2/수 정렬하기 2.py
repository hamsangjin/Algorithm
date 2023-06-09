import sys

n = int(sys.stdin.readline().strip())

result = []
for i in range(n):
  num = int(sys.stdin.readline().strip())
  result.append(num)

for i in sorted(result):
  print(i)