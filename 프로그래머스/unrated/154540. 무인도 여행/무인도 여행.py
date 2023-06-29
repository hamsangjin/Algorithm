import sys
sys.setrecursionlimit(int(1e6))

dr = [-1, 0, 1, 0]
dc = [0, 1, 0, -1]
cnt = 0

def DFS(r, c, n, m, maps):
    global cnt
    cnt += int(maps[r][c])
    maps[r][c] = 'X'
    
    for i in range(4):
        nr = r + dr[i]
        nc = c + dc[i]
        if nr >= 0 and nr < n and nc >= 0 and nc < m and maps[nr][nc] != 'X':
            DFS(nr, nc, n, m, maps)

def solution(maps):
    global cnt
    n = len(maps)
    m = len(maps[0])
    answer = []
    maps = [list(row) for row in maps]
    
    for i in range(n):
        for j in range(m):
            if maps[i][j] != 'X':
                cnt = 0
                DFS(i, j, n, m, maps)
                answer.append(cnt)
    if answer:
        return sorted(answer)
    else:
        return [-1]