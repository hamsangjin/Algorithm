import sys

t = int(sys.stdin.readline().strip())

for i in range(t):
  h = 1
  result = ''
  hwn = list(map(int, sys.stdin.readline().strip().split()))
  while(True):
    if hwn[2] - hwn[0] > 0:
      h += 1
      hwn[2] = hwn[2] - hwn[0]
    else:
      if len(str(h)) <= 1:
        result = str(hwn[2]) + '0' + str(h)
        print(result)
        break
      else:
        result = str(hwn[2]) + str(h)
        print(result)
        break