import sys
from collections import deque

# 상우하좌
dr = [-1, 0, 1, 0]
dc = [0, 1, 0, -1]

# N, M 입력
N, M = map(int, sys.stdin.readline().strip().split())

graph = []
Q = deque()
ch = [[0] * M for _ in range(N)]

# 지도 저장
for r in range(N):
  # 한 행 입력
  graph.append(list(map(int, sys.stdin.readline().strip().split())))
  # 해당 행에 목표지점 있나 확인
  for c in range(M):
    # 목표 지점이 있다면 
    # 목표지점 큐에 삽입 / 해당 지점 0으로 변경 / ch에 방문했다고 표시
    if graph[r][c] == 2:
      graph[r][c] = 0
      Q.append([r, c])
      ch[r][c] = 1

# 목표 지점에서부터 갈 수 있는 모든 지점을 방문
while Q:
  # 현재 큐에 삽입되어 있는 지점들만큼 반복
  length = len(Q)
  for _ in range(length):
    # 지점 하나 꺼내기
    r, c = Q.popleft()

    # 현재 지점에서 갈 수 있는 지점 찾기
    for i in range(4):
      nr = r + dr[i]
      nc = c + dc[i]

      # 지도의 범위에서 벗어나거나
      # 갈 수 있는 땅이거나
      # 방문하지 않은 땅인 경우에만
      if 0 <= nr < N and 0 <= nc < M and ch[nr][nc] == 0 and graph[nr][nc] == 1:
        
        # 해당 지점방문했다고 표시
        ch[nr][nc] = 1

        # 움직인 거리 : 현재 지점까지의 거리 + 1
        graph[nr][nc] = graph[r][c] + 1
        
        # 이제 방문했으므로 큐에 삽입
        Q.append([nr, nc])
        
# BFS를 돌고나서도 1인 땅이 있나 확인 후 변경
# 변경되었다면 해당 행 출력
for i in range(N):
  for j in range(M):
    # 원래 갈 수 있는 땅인 부분 중에서 도달할 수 없는 위치가 있냐 ?
    if ch[i][j] == 0 and graph[i][j] == 1:
      # 그렇다면 -1로 변경
      graph[i][j] = -1
  # 원래 갈 수 있는 땅인 부분 중에서 도달할 수 없는 위치있는지 확인하고 변경한 다음 출력
  print(*graph[i])