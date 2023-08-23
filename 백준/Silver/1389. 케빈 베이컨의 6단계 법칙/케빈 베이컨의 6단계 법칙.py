import sys
from collections import deque

N, M = map(int, sys.stdin.readline().strip().split())

graph = [[] for _ in range(N+1)]

for _ in range(M):
  A, B = map(int, sys.stdin.readline().strip().split())
  graph[A].append(B)
  graph[B].append(A)

def BFS(graph, start):

  # i의 케빈 베이컨들
  num = [0] * (N+1)

  # 시작 부분 방문표시
  ch[start] = 1

  # 시작 부분을 기준으로 시작
  Q = deque()
  Q.append(start)

  while Q:
    x = Q.popleft()
    for i in graph[x]:
      # 찾지 않은 친구인 경우에만
      if ch[i] == 0:
        # 한 번 거칠 때마다 + 1
        num[i] = num[x] + 1
        # 거쳤으니 찾았다고 표시
        ch[i] = 1
        # 또 해당 친구에서 다른 친구로 갈 수 있는 루트 찾기
        # 어차피 이미 찾은 친구는 표시되어 있으므로
        # 가장 최소값으로 찾아짐
        Q.append(i)

  # 케빈 베이컨의 수를 합해야 하므로 sum 연산
  return sum(num)

answer = []

# 1 ~ N까지 케빈 베이컨의 수 찾기
for i in range(1, N+1):
  # 이미 찾았는지 확인할 리스트
  ch = [0] *(N+1)
  # i의 케빈 베이컨의 수 찾기
  answer.append(BFS(graph, i))

# 1 ~ N까지의 케빈 베이컨 수 중 가장 작은 값을 가진 사람
# 값이 같은 경우 index(사람의 번호)가 적은 걸로 출력
print(answer.index(min(answer)) + 1)