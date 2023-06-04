n = int(input())

for i in range(n):
    test = input()
    score = 0
    score_count = 0
    for i in range(len(test)):
        if test[i] == "O":
            score_count += 1
            score += score_count
        else :
            score_count = 0
    print(score)