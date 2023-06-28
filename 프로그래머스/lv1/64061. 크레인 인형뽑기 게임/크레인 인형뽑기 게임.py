def solution(board, moves): 
    answer = 0
    dolls = []
    for pos in moves:
        for i in range(len(board)):
            if board[i][pos-1] != 0:
                tmp = board[i][pos-1] 
                board[i][pos-1] = 0
                if dolls and dolls[-1] == tmp:
                    dolls.pop()
                    answer += 2 
                else:
                    dolls.append(tmp)
                break
    return answer