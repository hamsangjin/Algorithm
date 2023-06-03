a = int(input())
sum = 1
if a == 0:
    print(1)
else:
    for i in range(a):
        sum *= i+1
    print(sum)