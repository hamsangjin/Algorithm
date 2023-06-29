point = 0

def DFS(k, cnt, n, ch, dungeons):
    global point
    
    # 가장 높은 횟수를 저장
    point = max(point, cnt)
    
    for i in range(n):
        if k >= dungeons[i][0] and ch[i] == 0:
            ch[i] = 1
            DFS(k-dungeons[i][1], cnt+1, n, ch, dungeons)
            ch[i] = 0

def solution(k, dungeons):
    global point
    point = 0
    n = len(dungeons)
    
    # 던전은 한 번씩 탐험할 수 있으므로 확인할 변수
    ch = [0] * n
    
    DFS(k, 0, n, ch, dungeons)
    
    return point