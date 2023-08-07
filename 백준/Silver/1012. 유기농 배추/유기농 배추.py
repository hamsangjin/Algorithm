import sys
sys.setrecursionlimit(10000)

T = int(sys.stdin.readline().strip())

dr = [-1, 0, 1, 0]
dc = [0, 1, 0, -1]

def DFS(r, c, n, m, board):
  board[r][c] = 0

  for i in range(4):
    nr = r + dr[i]
    nc = c + dc[i]
    if nr >= 0 and nr < n and nc >= 0 and nc < m and board[nr][nc] == 1:
      DFS(nr, nc, n, m, board)

for _ in range(T):
  M, N, K = map(int, sys.stdin.readline().strip().split())

  # 배추밭의 크기
  board = [[0]*N for _ in range(M)]

  # 배추가 심어진 위치(1) 표시
  for _ in range(K):
    i, j = map(int, sys.stdin.readline().strip().split())
    board[i][j] = 1
  
  # 최소 배추 흰지렁이 개수
  cnt = 0

  # board를 하나씩 돌면서 만약 배추가 심어진 곳이면
  # 인접한 배추까지 다 0으로 변경하며
  # 다 변경한 후에 배추 흰지렁이의 개수를 1개 더한다.
  for i in range(M):
    for j in range(N):
      if board[i][j] == 1:
        DFS(i, j, M, N, board)
        cnt += 1
  
  print(cnt)