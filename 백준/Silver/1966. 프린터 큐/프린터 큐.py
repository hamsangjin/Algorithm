from collections import deque

import sys

t = int(sys.stdin.readline().strip())

for _ in range(t):
  dq = deque()
  n, m = map(int, sys.stdin.readline().strip().split())
  ranks = list(map(int, sys.stdin.readline().strip().split()))

  for i, rank in enumerate(ranks):
    # 중요도가 똑같을 시 몇 번째로 출력할지 모르기에 i도 추가
    dq.append((i, rank))

  # index 저장 후 중요도에 따라 정렬
  ranks.sort()
  count = 0

  while(dq):
    # dq의 첫번째 원소 출력해 저장
    i, rank = dq.popleft()
    
    # 중요도 제일 높냐 ? -> 출력 대상
    if rank == ranks[-1]:
      ranks.pop()
      count += 1
      # 그리고 그 출력한 대상의 인덱스가 m과 같냐
      if i == m:
        # 그럼 종료
        print(count)
        break
    else:
        # 아니면 뒤에 삽입
        dq.append((i, rank))