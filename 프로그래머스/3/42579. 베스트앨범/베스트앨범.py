from collections import defaultdict

def solution(genres, plays):
    dict = defaultdict(list)
    best = []
    n = len(genres)

    for i in range(n):
        if len(dict[genres[i]]) == 0:
            dict[genres[i]] = []
            dict[genres[i]].append([plays[i], i])
        else:
            dict[genres[i]].append([plays[i], i])
    
    for genre in dict:
        dict[genre].sort(key=lambda x: (-x[0], x[1]))

    high = []
    for genre in dict:
        temp = 0
        for i in range(len(dict[genre])):
            temp += dict[genre][i][0]
        high.append([genre, temp])
    high.sort(key = lambda x : -x[1])

    for genre, _ in high:
        if len(dict[genre]) == 1:
            best.append(dict[genre][0][1])
        else:
            best.append(dict[genre][0][1])
            best.append(dict[genre][1][1])
    return best

print(solution(["classic", "pop", "classic", "classic", "pop"], [500, 600, 800, 800, 2500]))
