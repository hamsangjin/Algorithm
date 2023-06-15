import sys

N = int(sys.stdin.readline().strip())

sizes = []
results = []

for i in range(N):
  sizes.append(list(map(int, sys.stdin.readline().strip().split())))

for size1 in sizes:
  count = 1
  for size2 in sizes:
    if size1[0] < size2[0] and size1[1] < size2[1]:
      count += 1
  results.append(count)

for rank in results:
  print(rank, end=" ")