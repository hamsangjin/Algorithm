import sys
sys.setrecursionlimit(10**6)

N = int(sys.stdin.readline().strip())

# tree, parent 초기화
tree = [[] for _ in range(N + 1)]
parent = [None for _ in range(N + 1)]

# 주어진 노드로 트리 값 할당
for _ in range(N - 1):
    a, b = map(int, sys.stdin.readline().strip().split())
    tree[a].append(b)
    tree[b].append(a)

def DFS(v):
    for i in tree[v]:
      if not parent[i]:
         parent[i] = v
         DFS(i)

DFS(1)

for i in range(2, N + 1):
   print(parent[i])