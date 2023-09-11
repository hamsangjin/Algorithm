import sys
from collections import deque

# N, M 입력
N, M = map(int, sys.stdin.readline().strip().split())

# 사다리의 정보들
ladders = {}
for _ in range(N):
  x, y = map(int, sys.stdin.readline().strip().split())
  ladders[x] = y

# 뱀의 정보들
snakes = {}
for _ in range(M):
  x, y = map(int, sys.stdin.readline().strip().split())
  snakes[x] = y

# 이미 이동한 칸에 대한 정보
ch = [0] * 101
Q = deque()
# 1에서 시작
Q.append(1)
ch[1] = 0

cnt = 0
# 100번째 칸에 이동했다면 while문을 종료할 변수
flag = True

while flag:
  length = len(Q)
  for _ in range(length):
    x = Q.popleft()

    # 100번째 칸으로 이동한 경우
    if x == 100:
      print(cnt)
      flag = False
      break

    # 주사위 1 ~ 6까지 돌리기
    for i in range(1, 7):
      nx = x + i

      # 100번째 칸을 넘어가지 않고 방문하지 않았던 칸이냐 ?
      if nx <= 100 and ch[nx] == 0:
        # 해당 위치 방문했다고 표시
        ch[nx] = 1

        # 사다리 칸인지 확인
        if nx in ladders.keys():
          ch[ladders[nx]] = 1
          Q.append(ladders[nx])

        # 뱀 칸인지 확인
        elif nx in snakes.keys():
          ch[snakes[nx]] = 1
          Q.append(snakes[nx])
        
        # 사다리 / 뱀 칸이 아닌 그냥 이동
        else:
          Q.append(nx)
  
  # 해당 횟수로 100번째 칸으로 이동 못 했으므로
  # 횟수 + 1
  cnt += 1