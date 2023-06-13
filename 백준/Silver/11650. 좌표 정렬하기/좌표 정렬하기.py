import sys

n = int(sys.stdin.readline().strip())

result = []
for i in range(n):
  result.append(list(map(int, sys.stdin.readline().strip().split())))

result = sorted(result, key=lambda x: (x[0], x[1]))

for i in range(n):
  print(result[i][0], result[i][1])