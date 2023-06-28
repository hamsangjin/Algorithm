def solution(rank, attendance):
    n = len(rank)
    answer =0
    r_a = []

    for i in range(n):
        if attendance[i]:
            r_a.append([rank[i], i])

    r_a.sort(key = lambda v : v[0])

    return 10000 * r_a[0][1] + 100 * r_a[1][1] + r_a[2][1]