def solution(rank, attendance):
    n = len(rank)

    r_a = []
    answer = []
    for i in range(n):
        r_a.append([rank[i], attendance[i]])
    
    cnt = 0
    for x in sorted(r_a, key= lambda x: x[0]):
        if x[1] == True:
            answer.append(r_a.index(x))
            cnt += 1
        if cnt == 3:
            break

    return 10000 * answer[0] + 100 * answer[1] + answer[2]