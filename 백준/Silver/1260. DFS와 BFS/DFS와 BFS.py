import sys
from collections import deque
sys.setrecursionlimit(10000)

N, M, V = map(int, sys.stdin.readline().strip().split())


# 관계 그래프 생성
graph = [[] for _ in range(N+1)]

for _ in range(M):
  a, b = map(int, sys.stdin.readline().strip().split())
  graph[a].append(b)
  graph[b].append(a)

# 정점 번호가 작은 것을 먼저 방문하기 위해 그래프 정렬
for i in range(1, N+1):
  graph[i].sort()

# BFS
ch = [0] * (N+1)

Q = deque()
Q.append(V)
BFS_answer = []
BFS_answer.append(V)
ch[V] = 1

while Q:
  n = len(Q)
  for i in range(n):
    v = Q.popleft()
    for nv in graph[v]:
      if ch[nv] == 0:
        BFS_answer.append(nv)
        ch[nv] = 1
        Q.append(nv)

# DFS
ch = [0] * (N+1)

DFS_answer = []

def DFS(v, ch, graph):
  ch[v] = 1
  DFS_answer.append(v)
  for nv in graph[v]:
    if ch[nv] == 0:
      DFS(nv, ch, graph)

DFS(V, ch, graph)

print(*DFS_answer)
print(*BFS_answer)