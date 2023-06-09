import sys

n = int(sys.stdin.readline().strip())

result = set()
for i in range(n):
  n = sys.stdin.readline().strip()
  result.add(n)

result = list(result)

result = sorted(result)
result = sorted(result, key=len)

for i in result:
  print(i)