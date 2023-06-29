from collections import deque

def solution(maps):
    n = len(maps)
    m = len(maps[0])
    
    dr = [-1, 0, 1, 0]
    dc = [0, 1, 0, -1]
    
    dist = [[0]*m for _ in range(n)]
    
    Q = deque()
    Q.append([0, 0])
    maps[0][0] = 0
    L = 1
    
    while Q:
        length = len(Q)
        for _ in range(length):
            v = Q.popleft()
            for i in range(4):
                nr = v[0] + dr[i]
                nc = v[1] + dc[i]
                if nr >= 0 and nr < n and nc >= 0 and nc < m and maps[nr][nc] == 1:
                    dist[nr][nc] = L+1
                    maps[nr][nc] = 0
                    Q.append([nr, nc])
        L += 1
    
    if dist[n-1][m-1]:
        return dist[n-1][m-1]
    else:
        return -1