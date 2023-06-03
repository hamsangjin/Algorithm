n, m= map(int,input().split())
a = []
b = []
sum = []

for i in range(n):
    nums = list(map(int,input().split()))
    a.append(nums)

for i in range(n):
    nums = list(map(int,input().split()))
    b.append(nums)

for i in range(n):
    for j in range(m):
        sum.append(a[i][j] + b[i][j])
    print(*sum)
    sum = []