from collections import defaultdict

def solution(genres, plays):
    dic1, dic2 = defaultdict(list), defaultdict(int)
    answer = []

    for i, (g, p) in enumerate(zip(genres, plays)):

        dic1[g].append((i, p))
        dic2[g] += p

    for (g, _) in sorted(dic2.items(), key = lambda x : -x[1]):
        for (i, p) in sorted(dic1[g], key=lambda x:-x[1])[:2]:
            answer.append(i)

    return answer
