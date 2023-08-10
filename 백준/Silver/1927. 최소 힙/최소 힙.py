import sys
import heapq

N = int(sys.stdin.readline().strip())

heap = []

# x가 0이면 가장 작은 값 출력 / 힙이 비었으면 0 출력
# 0이 아니면 힙에 추가

for _ in range(N):
  # print(heap)
  x = int(sys.stdin.readline().strip())

  # x가 0인 경우 가장 작은 값 출력
  if x == 0:
    
    if len(heap) != 0:
      # 힙이 비어있지 않는 경우 가장 작은 값 출력
      print(heapq.heappop(heap))
    else:
      # 힙이 비어있는 경우 0 출력
      print(0)

  # x가 0이 아닌 경우 힙에 추가    
  else:
    heapq.heappush(heap, x)
