import sys

N = int(sys.stdin.readline().strip())

coordinates = []

for i in range(N):
  coordinates.append(list(map(int, sys.stdin.readline().strip().split())))

coordinates = sorted(coordinates, key=lambda a : (a[1], a[0]))

for i in range(N):
  print(coordinates[i][0], coordinates[i][1])