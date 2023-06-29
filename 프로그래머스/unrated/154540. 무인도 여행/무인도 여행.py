import sys
# 런타임오류가 발생하면 아래 줄을 작성
# 제한을 늘려야 함
sys.setrecursionlimit(int(1e6))


dr = [-1, 0, 1, 0]
dc = [0, 1, 0 , -1]
cnt = 0
def DFS(r, c, n, m, board):
    global cnt
    cnt += int(board[r][c])
    board[r][c] = 'X'
    for i in range(4):
        nr = r + dr[i]
        nc = c + dc[i]
        if nr >= 0 and nr < n and nc >= 0 and nc < m and board[nr][nc] != 'X':
            DFS(nr, nc, n, m, board)

def solution(maps):
    global cnt
    board = [list(row) for row in maps]
    n = len(maps)
    m = len(maps[0])
    answer = []
    for i in range(n):
        for j in range(m):
            if board[i][j] != 'X':
                cnt = 0
                DFS(i, j, n, m, board)
                answer.append(cnt)
    if answer:
        return sorted(answer)
    else:
        return [-1]

print(solution(["X591X","X1X5X","X231X", "1XXX1"]))