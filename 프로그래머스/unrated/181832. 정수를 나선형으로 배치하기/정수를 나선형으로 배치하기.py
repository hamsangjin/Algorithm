def solution(n):
    dr = [0, 1, 0, -1]  # 오른쪽, 아래, 왼쪽, 위
    dc = [1, 0, -1, 0]
    answer = [[0] * n for _ in range(n)]
    num = 1  # 채워질 숫자
    r, c = 0, 0  # 현재 위치
    d = 0  # 현재 방향 (오른쪽)

    while num <= n * n:
        answer[r][c] = num
        num += 1

        nr = r + dr[d]
        nc = c + dc[d]
        if nr < 0 or nr >= n or nc < 0 or nc >= n or answer[nr][nc] != 0:
            d = (d + 1) % 4
            nr = r + dr[d]
            nc = c + dc[d]

        r, c = nr, nc

    return answer