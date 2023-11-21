from collections import defaultdict

def solution(clothes):
    dict = defaultdict(int)
    for _, y in clothes:
        dict[y] += 1
    
    answer = 1
    
    for x in dict:
        answer *= (dict[x] + 1)

    return answer - 1