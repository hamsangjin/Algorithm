import sys
sys.setrecursionlimit(1000000)

dr = [-1, 0, 1, 0]
dc = [0, 1, 0, -1]

def DFS(r, c):
  ch[r][c] = 1
  color = colors[r][c]

  for i in range(4):
    nr = r + dr[i]
    nc = c + dc[i]

    if (0 <= nr < N) and (0 <= nc < N) and (ch[nr][nc] == 0) and (colors[nr][nc] == color):
      DFS(nr, nc)

N = int(sys.stdin.readline().strip())

ch = [[0]*N for _ in range(N)]

# 그리드 생성
colors = []
for _ in range(N):
  colors.append(list(sys.stdin.readline().strip()))

answer1 = answer2 = 0

for i in range(N):
  for j in range(N):
    if ch[i][j] == 0:
      DFS(i, j)
      answer1 += 1

for i in range(N):
  for j in range(N):
    if colors[i][j] == 'G':
      colors[i][j] = 'R'

ch = [[0]*N for _ in range(N)]

for i in range(N):
  for j in range(N):
    if ch[i][j] == 0:
      DFS(i, j)
      answer2 += 1

print(answer1, answer2)