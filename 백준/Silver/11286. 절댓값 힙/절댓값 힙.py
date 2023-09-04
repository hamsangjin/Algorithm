import sys
import heapq

heap = []

for _ in range(int(sys.stdin.readline().strip())):
  x = int(sys.stdin.readline().strip())
  
  if x == 0:
    try:
      print(heapq.heappop(heap)[1])
    except:
      print(0)
  else:
      heapq.heappush(heap, (abs(x), x))