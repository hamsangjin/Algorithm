result = []

while(True):
    n, m= map(int,input().split())
    if n+m == 0:
        break
    else:
        result.append(n+m)

for i in result:
    print(i)