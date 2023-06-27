from collections import defaultdict

def solution(keymap, targets):
    # 0으로 초기화
    sH = defaultdict(int)
    answer = []

    # ex) "ABACD"
    for key in keymap:
        # ex) "A"
        for i, char in enumerate(key):
            # 기존 눌러야할 횟수보다 적을 경우에만 변경
            if sH[char] > (i+1) or sH[char] == 0:
                # ex) "A" : 1
                sH[char] = i + 1

    # ex) "ABCD"
    for key in targets:
        point = 0

        # ex) "A"
        for char in key:
            if char in sH:
                point += sH[char]
            else:
                point = -1
                break

        answer.append(point)

    return answer