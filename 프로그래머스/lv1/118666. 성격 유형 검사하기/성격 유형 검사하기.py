from collections import defaultdict

    # A : 어피치
    # N : 네오
    # C : 콘
    # P : 프로도

def solution(survey, choices):
    answer = ''
    points = {"1": 3, "2": 2, "3": 1, "4": 0, "5": 1, "6": 2, "7": 3}
    categories = [['R', 'T'], ['C', 'F'], ['J', 'M'], ['A', 'N']]
    sH = defaultdict(int)

    for i in range(len(survey)):
        # 매우 미동의 ~ 약간 비동의
        if choices[i] <= 3:
            # print('choices <= 3 : ', points[str(choices[i])])
            sH[survey[i][0]] += points[str(choices[i])]

        # 약간동의 ~ 매우 동의
        elif choices[i] >= 5:
            # print('choices >= 3 : ', points[str(choices)])
            sH[survey[i][1]] += points[str(choices[i])]

        # 모르겠음 그냥 넘어감
        else:
            continue

    # print(sH)

    for category in categories:
        # print('sH[category[0]] = ', sH[category[0]])
        # print('sH[category[1]] = ', sH[category[1]])
        if sH[category[0]] > sH[category[1]]:
            answer += category[0]
        elif sH[category[0]] < sH[category[1]]:
            answer += category[1]
        else:
            sort_ = sorted(category[0]+category[1])
            answer += sort_[0]

    return answer

print(solution(["AN", "CF", "MJ", "RT", "NA"], [5, 3, 2, 7, 5]))