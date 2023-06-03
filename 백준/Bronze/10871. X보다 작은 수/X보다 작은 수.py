in_1 = list(map(int,input().split()))
in_2 = list(map(int,input().split()))
result = []
for i in in_2:
    if in_1[1] > i:
        result.append(i)
for i in result:
    print(i)