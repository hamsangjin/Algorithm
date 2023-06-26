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
        
        # 명령 실행 전 nr, nc에 좌표 복사(r, c로 진행시 이동 불가 시 되돌리지 못하기 때문)
        nr, nc = r, c
        
        # 명령 성공 여부
        flag = True
        
        for i in range(int(distance)):
            # 거리가 n이라면 1 ~ n까지 진행
            nr, nc = nr + dr[dic[direction]], nc + dc[dic[direction]]
            
            # 1 ~ n 중에서 하나라도 공원을 나가거나 장애물을 지나게 된다면 실패라고 설정하고 for문 벗어남
            if nr < 0 or nr >= n or nc < 0 or nc >= m or park[nr][nc] == 'X':
                flag = False
                break
        # 성공 = 움직인 좌표 / 실패 = 기존 좌표
        if flag:
            r, c = nr, nc

    return [r, c]