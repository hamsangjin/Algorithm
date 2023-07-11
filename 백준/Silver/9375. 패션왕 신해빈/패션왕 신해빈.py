import sys

T = int(sys.stdin.readline().strip())

for _ in range(T):
    wears = {}
    n = int(sys.stdin.readline().strip())
    for _ in range(n):
        name, type = sys.stdin.readline().strip().split()
        if type in wears:
            # 종류가 이미 있으면 의상 이름만 저장
            wears[type].append(name)
        else:
            # 종류마다 리스트로 저장
            wears[type] = [name]
    
    cnt = 1

    for x in wears:
        cnt *= (len(wears[x]) + 1)

    print(cnt-1)