import sys
import heapq as hq

# N 입력
N = int(sys.stdin.readline().strip())
heap = []

for _ in range(N):
  # x 입력
  x = int(sys.stdin.readline().strip())

  # x가 0이 아닌 경우
  if x:
    # heapq 모듈에서는 최소 힙(Min Heap)만을 지원함
    # 하지만 문제는 최대힙을 구현해야함
    # 따라서 음수로 만듦으로써 최대값을 출력할 수 있게 해준다.
    hq.heappush(heap, (-x))

  # x가 0인 경우
  else:
    # 힙에 요소가 있는 경우
    try:
      # 음수로 저장되어 있으므로 -1을 곱해 최대값 출력
      print(-1 * hq.heappop(heap))

    # 힙에 요소가 없는 경우  
    except:
      # 0 출력
      print(0)
