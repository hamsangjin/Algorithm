import sys
from collections import deque

N, M = map(int, sys.stdin.readline().strip().split())

dr = [-1, 0, 1, 0]
dc = [0, 1, 0, -1]

graph = []
ch = [[0]*M for _ in range(N)]

for _ in range(N):
  graph.append(list(map(int, sys.stdin.readline().strip())))

Q = deque()
Q.append([0, 0])
ch[0][0] = 1

while Q:
  for _ in range(len(Q)):
    r, c = Q.popleft()
    for i in range(4):
      nr = r + dr[i]
      nc = c + dc[i]

      if 0 <= nr < N and 0 <= nc < M and ch[nr][nc] == 0 and graph[nr][nc] != 0:
        graph[nr][nc] = graph[r][c] + 1
        ch[nr][nc] = 1
        Q.append([nr, nc])

print(graph[N-1][M-1])