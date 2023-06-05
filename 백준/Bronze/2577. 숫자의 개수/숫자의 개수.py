n1 = int(input())
n2 = int(input())
n3 = int(input())

n_list = list(str(n1*n2*n3))

for i in range(10):
  print(n_list.count(str(i)))