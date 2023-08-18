import sys
from collections import deque

dr = [-1, 0, 1, 0]
dc = [0, 1, 0, -1]

M, N= map(int, sys.stdin.readline().strip().split())

house = []

for i in range(N):
  house.append(list(map(int, sys.stdin.readline().strip().split())))

Q = deque()

for i in range(N):
  for j in range(M):
    if house[i][j] == 1:
      Q.append([i, j])

day = 0

while Q:
  length = len(Q)
  for _ in range(length):
    r, c = Q.popleft()

    for i in range(4):
      nr = r + dr[i]
      nc = c + dc[i]

      if nr >= 0 and nr < N and nc >= 0 and nc < M and house[nr][nc] == 0:
        Q.append([nr, nc])
        house[nr][nc] = 1
      
  day += 1

hap = 0
minus = 0
for i in range(N):
  hap += sum(house[i])
  minus += house[i].count(-1)

if hap == (N*M)-(minus*2):
  print(day-1)
else:
  print(-1)