import sys

N = int(sys.stdin.readline().strip())

X = list(map(int, sys.stdin.readline().strip().split()))

X_sort = sorted(list(set(X)))

dic = {}
for i in range(len(X_sort)):
  dic[X_sort[i]] = i

for i in X:
  print(dic[i], end=" ")