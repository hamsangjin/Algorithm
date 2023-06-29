from collections import deque
def solution(maps):
    n = len(maps)
    m = len(maps[0])

    dist = [[0]*m for _ in range(n)]
    
    dr = [-1, 0, 1, 0]
    dc = [0, 1, 0, -1]
    
    Q = deque()
    Q.append([0, 0])
    maps[0][0] = 0

    # 시작 좌표도 포함하므로 L = 1
    L = 1
    
    while Q:
        length = len(Q)
        for _ in range(length):
            r, c = Q.popleft()
            for i in range(4):
                nr = r + dr[i]
                nc = c + dc[i]
                if  0 <= nr and nr < n and 0 <= nc and nc < m and maps[nr][nc] == 1:
                    Q.append([nr, nc])
                    maps[nr][nc] = 0
                    dist[nr][nc] = L + 1   
        L += 1    
    if dist[n-1][m-1] == 0:
        return -1
    else:
        return dist[n-1][m-1]
