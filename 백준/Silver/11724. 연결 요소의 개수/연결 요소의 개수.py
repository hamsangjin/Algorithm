import sys
sys.setrecursionlimit(10000)

# DFS 함수 정의
def DFS(v):
  # 호출될 시 그 정점 방문했다고 ch에 표시
  ch[v] = 1
  
  # 호출된 정점과 연결된 정점들 중 방문하지 않은 정점들을 기준으로 DFS 재귀 호출
  for nv in graph[v]:
    if ch[nv] == 0:
        DFS(nv)

# N, M 입력
N, M = map(int, sys.stdin.readline().strip().split())

# graph(인접 리스트) 생성
graph = [[0] for _ in range(N+1)]

# 해당 정점에 방문했는지 확인할 ch 생성
ch = [0] * (N+1)

# u, v를 입력 받아 graph(인접 리스트)에 추가
for _ in range(M):
  u, v  = map(int, sys.stdin.readline().strip().split())
  graph[u].append(v)
  graph[v].append(u)

# 모든 정점들을 돌며 연결된 곳이 있으면
# 방문했다고 표시 후 연결 요소들을 찾는다.

cnt = 0
for i in range(1, N+1):
  # 방문하지 않았는지 확인
  if ch[i] == 0:
    DFS(i)
    cnt += 1

print(cnt)