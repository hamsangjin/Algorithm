import sys
from collections import deque

# 상우하좌
dr = [-1, 0, 1, 0]
dc = [0, 1, 0, -1]

# M, N 입력
M, N= map(int, sys.stdin.readline().strip().split())

tray = []

# 토마토 칸
for _ in range(N):
  tray.append(list(map(int, sys.stdin.readline().strip().split())))

Q = deque()

# 토마토 중 익은 토마토들을 Q에 삽입
for r in range(N):
  for c in range(M):
    if tray[r][c] == 1:
      Q.append([r, c])

# 익은 토마토가 더이상 없을 때까지 반복
while Q:
  # 현재 큐에 삽입되어 있는 익은 토마토 개수만큼 반복
  length = len(Q)
  for _ in range(length):
    # 익은 토마토 하나 꺼내기
    r, c = Q.popleft()

    # 익은 토마토의 인접한 토마토들 비교
    for i in range(4):
      nr = r + dr[i]
      nc = c + dc[i]

      # 토마토 칸의 범위에서 벗어나거나
      # 익지 않은 토마토인 경우에만
      if nr >= 0 and nr < N and nc >= 0 and nc < M and tray[nr][nc] == 0:
        # 현재 칸까지의 소요일
        # 1로 시작했으므로 마지막에 -1 해야함
        tray[nr][nc] = tray[r][c] + 1
        
        # 이제 익은 토마토이므로 큐에 삽입
        Q.append([nr, nc])
        
day = 0

# 토마토 칸의 행
for row in tray:
  # 토마토 칸의 행의 토마토들
  for tomato in row:
    # BFS를 돌았는데도 익지 않은 토마토가 존재하냐
    if tomato == 0:
      # 그렇다면 모두 익지는 못하는 상황이므로 -1
      print(-1)
      # 그리고 종료
      exit(0)
  # 토마토들 중 가장 큰 값(소요일)을 찾는다
  day = max(day, max(row))

# 익은 토마토(1)부터 +1 했으므로 최종적으로 -1
print(day - 1)