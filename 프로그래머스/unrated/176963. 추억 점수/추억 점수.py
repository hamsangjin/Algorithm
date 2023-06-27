from collections import defaultdict

def solution(name, yearning, photo):
    
    sH = defaultdict(int)
    answer = []

    for i in range(len(name)):
        sH[name[i]] = yearning[i]
    
    for x in photo:
        point = 0
        for y in x:
            point += sH[y]
        answer.append(point)
    
    return answer