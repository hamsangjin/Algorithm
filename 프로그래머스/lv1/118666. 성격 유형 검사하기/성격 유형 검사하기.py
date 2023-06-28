from collections import defaultdict

def solution(survey, choices):
    answer = ''
    points = {"1": 3, "2": 2, "3": 1, "4": 0, "5": 1, "6": 2, "7": 3}
    categories = ['RT', 'CF', 'JM', 'AN']
    sH = defaultdict(int)

    for i in range(len(survey)):
        if choices[i] <= 3:
            sH[survey[i][0]] += points[str(choices[i])]

        elif choices[i] >= 5:
            sH[survey[i][1]] += points[str(choices[i])]

    for category in categories:
        if sH[category[0]] > sH[category[1]]:
            answer += category[0]
        elif sH[category[0]] < sH[category[1]]:
            answer += category[1]
        else:
            sort_ = sorted(category[0]+category[1])
            answer += sort_[0]

    return answer

print(solution(["AN", "CF", "MJ", "RT", "NA"], [5, 3, 2, 7, 5]))