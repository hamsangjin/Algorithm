from collections import defaultdict

def solution(s):
    answer = []
    
    sH = defaultdict(int)
    
    for x in s:
        sH[x] += 1

    for key in sH:
        if sH[key] == 1:
            answer.append(key)
            
    return "".join(sorted(answer))