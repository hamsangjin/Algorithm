import sys

N = int(sys.stdin.readline().strip())

graph = []
for i in range(N):
  graph.append(list(map(int, sys.stdin.readline().strip().split())))

for k in range(N):
  for i in range(N):
    for j in range(N):
      if graph[i][k] and graph[k][j]:
        graph[i][j] = 1

for i in range(N):
  print(*graph[i])