import sys
n = int(sys.stdin.readline().strip())

n_list = []

for i in range(n):
    n_list = list(map(int,str(i+1)))
    if (i+1) + sum(n_list) == n:
      print(i+1)
      break
    elif i+1 == n:
      print(0)
      break