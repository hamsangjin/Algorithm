T = int(input())
result = []
for i in range(T):
    n, m= map(int,input().split())
    result.append(n+m)
for i in result:
    print(i)