import sys
from collections import deque

dr = [-1, 0, 1, 0]
dc = [0, 1, 0, -1]

# 가로, 세로, 상자의 수
M, N, H = map(int, sys.stdin.readline().strip().split())

# 토마토 상자들
box = []
farm = []

# 토마토 상자 입력
for i in range(H):
  for j in range(N):
    box.append(list(map(int, sys.stdin.readline().strip().split())))
  farm.append(box)
  box = []

Q = deque()

# 익은 토마토들 큐에 넣기
for h in range(H):
  for i in range(N):
    for j in range(M):
      if farm[h][i][j] == 1:
        Q.append([h, i, j])

sec = -1

while Q:
  length = len(Q)
  for _ in range(length):
    h, r, c = Q.popleft()
    
    for i in range(4):
      nr = r + dr[i]
      nc = c + dc[i]
      if 0 <= nr < N and 0 <= nc < M and farm[h][nr][nc] == 0:
        farm[h][nr][nc] = 1
        Q.append([h, nr, nc])
    
    for nh in [h-1, h+1]:
      if 0 <= nh < H and farm[nh][r][c] == 0:
        farm[nh][r][c] = 1
        Q.append([nh, r, c])
    
  sec += 1

for h in range(H):
  for i in range(N):
    for j in range(M):
      if farm[h][i][j] == 0:
        sec = -1

print(sec)