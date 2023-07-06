import sys

def DFS(v, graph, ch):
    global cnt
    cnt += 1
    ch[v] = 1
    for nv in graph[v]:
        if ch[nv] == 0:
            DFS(nv, graph, ch)

n = int(sys.stdin.readline().strip())
m = int(sys.stdin.readline().strip())

# 인접 리스트 생성
graph = [[] for _ in range(n+1)]
# 카운팅한 컴퓨터 확인하기 위한 변수
ch = [0] * (n+1)

cnt = 0

# 양방향이므로 둘 다 저장
for _ in range(m):
    i, j = map(int, sys.stdin.readline().strip().split())
    graph[i].append(j)
    graph[j].append(i)

# 1번 컴퓨터에 직접적으로 연결된 컴퓨터들부터
DFS(1, graph, ch)

# 1을 제외하기 위해 -1
print(cnt-1)