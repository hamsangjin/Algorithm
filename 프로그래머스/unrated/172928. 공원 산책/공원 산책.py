def solution(park, routes):
    dr = [-1, 0, 1, 0]
    dc = [0, 1, 0, -1]
    dic = {'N':0, 'E':1, 'S':2, 'W':3}
    
    n = len(park)
    m = len(park[0])
    
    # 시작 지점 찾기
    for i in range(len(park)):
        for j in range(len(park[0])):
            if park[i][j] == 'S':
                r, c = i, j

    # 명령어 하나씩 for문 돌기
    for cmd in routes:
        # 방향과 거리 분할 입력
        direction, distance = cmd.split()
        
        # 명령 실행 전 좌표 저장(이동 불가 시 되돌리기 위함)
        nr, nc = r, c
        flag = True
        
        for i in range(int(distance)):
            nr, nc = nr + dr[dic[direction]], nc + dc[dic[direction]]
            if nr < 0 or nr >= n or nc < 0 or nc >= m or park[nr][nc] == 'X':
                flag = False
                break
        if flag:
            r, c = nr, nc

    return [r, c]