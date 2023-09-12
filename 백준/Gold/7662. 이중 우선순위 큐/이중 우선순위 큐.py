import sys
import heapq

# T 입력
T = int(sys.stdin.readline().strip())

for _ in range(T):

  minH, maxH = [], []
  k = int(sys.stdin.readline().strip())
  ch = [0] * 1000001

  for i in range(k):
    cmd, n = map(str, sys.stdin.readline().strip().split())
    n = int(n)
    if cmd == 'I':
      heapq.heappush(minH, (n, i))
      heapq.heappush(maxH, (-n, i))
      ch[i] = 1

    elif cmd == 'D':
      # 최소값 삭제
      if n == -1:
        # maxH과 동기화 부분
        while minH and ch[minH[0][1]] == 0:
          heapq.heappop(minH)
        
        # 이제 최소값 삭제 하나 하고
        # ch에 삭제했다고 표시
        if minH:
          ch[minH[0][1]] = 0
          heapq.heappop(minH)

      elif n == 1:
        # minH과 동기화 부분
        while maxH and ch[maxH[0][1]] == 0:
          heapq.heappop(maxH)
        
        # 이제 최소값 삭제 하나 하고
        # ch에 삭제했다고 표시
        if maxH:
          ch[maxH[0][1]] = 0
          heapq.heappop(maxH)

  while minH and ch[minH[0][1]] == 0:
          heapq.heappop(minH)

  while maxH and ch[maxH[0][1]] == 0:
          heapq.heappop(maxH)

  if minH and maxH:
     print(-maxH[0][0], minH[0][0])
  else:
     print('EMPTY')