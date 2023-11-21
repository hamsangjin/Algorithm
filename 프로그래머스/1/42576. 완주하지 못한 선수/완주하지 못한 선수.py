from collections import defaultdict

def solution(participant, completion):
    ch = defaultdict(int)

    for person in participant:
      ch[person] += 1

    for person in completion:
      ch[person] -= 1


    for person, cnt in ch.items():
        if cnt == 1:
            return person
            break