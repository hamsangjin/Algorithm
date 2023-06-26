def solution(n):
    answer = [[0]*n for _ in range(n)] 

    dr = [-1, 0, 1, 0]
    dc = [0, 1, 0, -1]

    r, c = 0, 0
    d, cnt = 1, 1

    while(n*n > cnt):
        nr = r + dr[d]
        nc = c + dc[d]
        if nr < 0 or nr >= n or nc < 0 or nc >=n or answer[nr][nc] != 0:
            d = (d + 1) % 4
            continue 
        answer[r][c] = cnt
        cnt += 1
        r = nr
        c = nc
    # if문으로 인해 마지막 원소 안 되므로 while문 끝나고 적용
    answer[r][c] = cnt
    return answer