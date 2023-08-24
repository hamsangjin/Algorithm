import sys

def DFS(r, c, cp):
  global cnt
  # 해당 단지 cp번 단지로 표시
  apts[r][c] = cp

  # cp번의 단지 수 + 1
  cnt += 1

  # 해당 단지 방문 표시
  ch[r][c] = 1
  
  # 상우하좌 방향으로 이동
  for i in range(4):
    # 이동할 좌표
    nr = r + dr[i]
    nc = c + dc[i]

    # 지도의 범위에서 벗어나지 않고,
    # 방문하지 않은 단지이며,
    # 집이 있는 곳(1)인 경우에만
    if 0 <= nr < N and 0 <= nc < N and ch[nr][nc] == 0 and apts[nr][nc] != 0:
      # DFS 재귀 호출
      DFS(nr, nc, cp)

N = int(sys.stdin.readline().strip())

dr = [-1, 0, 1, 0]
dc = [0, 1, 0, -1]

# 단지 정보 입력
apts = []
for _ in range(N):
  apts.append(list(map(int, sys.stdin.readline().strip())))

# 해당 단지 방문했는지 확인
ch = [[0]*N for _ in range(N)]

cnts = []       # 단지들의 집의 수
global cnt      # 단지 1개의 집의 수
cp = 0          # 단지 수

for i in range(N):
  for j in range(N):
    if apts[i][j] != 0 and ch[i][j] == 0:
      cnt = 0
      cp += 1
      DFS(i, j, cp)
      cnts.append(cnt)
      
print(cp)
cnts.sort()
for i in range(len(cnts)):
  print(cnts[i])