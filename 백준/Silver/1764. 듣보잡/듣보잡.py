import sys

N, M = map(int, sys.stdin.readline().strip().split())

set1 = set()
set2 = set()

# 듣도 못한 사람
for _ in range(N):
    set1.add(sys.stdin.readline().strip())

# 보도 못한 사람
for _ in range(M):
    set2.add(sys.stdin.readline().strip())

# 듣보잡들
result = sorted(list(set1 & set2))

print(len(result))

# 듣보잡 이름
for x in result:
    print(x)