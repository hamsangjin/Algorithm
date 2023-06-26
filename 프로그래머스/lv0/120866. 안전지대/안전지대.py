def solution(board):
    # 방향배열
    dr = [-1, 1, 0, 0, -1, -1, 1, 1]
    dc = [0, 0, -1, 1, -1, 1, -1, 1]
    
    # board가 n*n이라는 조건
    n = len(board)
    
    # 지뢰 확인 for문
    for i in range(n):
        for j in range(n):
            if board[i][j] == 1:
            # 위험 지역 추가
                for k in range(8):
                    nr = i + dr[k]
                    nc = j + dc[k]   
                    # 위험지역은 2로 표시
                    if 0 <= nr < n and 0 <= nc < n:
                        if board[nr][nc] != 1:
                            board[nr][nc] = 2

    # 지뢰와 위험지역은 1, 2이므로 0만 카운팅
    answer = 0
    for i in range(n):
        for j in range(n):
            if board[i][j] == 0:
                answer += 1
    return answer