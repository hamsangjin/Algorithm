import sys
from collections import deque

N, K= map(int, sys.stdin.readline().strip().split())  # N, K 입력

Q = deque() # Q 생성
Q.append(N) # 수빈이 위치(N)를 큐에 저장

sec = 0 # 수빈이가 동생을 찾는 시간
flag = True # 동생을 찾았다면 while문을 종료할 변수
ch = [0]  * 100001  # 한 번 방문한 좌표라면 제외하기 위한 리스트

while flag: # 동생을 찾기 전까지 반복
  # 현재 큐에 있는 위치(X)들을 기준으로 X-1, X+1, 2*X을 이동해 큐의 끝에 삽입
  length = len(Q)

  # 큐의 길이(큐에 저장된 수 개수)만큼 반복
  for _ in range(length):
    x = Q.popleft() # 큐에 있는 수 중 하나 꺼내기
    if x == K:  # 큐에서 꺼낸 수가 동생의 위치와 동일하냐?
      print(sec)  # 그렇다면 현재까지의 시간을 출력
      flag = False  # 찾았다고 flag에 전달
      break # for문 종료
    
    # 이동할 수 있는 경우의 수들을 큐에 삽입
    for nx in [x-1, x+1, 2*x]:
      # 아래 if문을 하지 않는다면 메모리초과로 오류
      if 0 <= nx and nx <= 100000 and ch[nx] == 0:    # 현재 좌표가 범위 밖이거나, 이미 방문한 좌표라면 큐에 삽입 X
        Q.append(nx)  # 큐에 삽입
        ch[nx] = 1    # 방문했다고 표시
  # 현재 큐에 있던 수들이 동생의 위치와 동일하지 않다면 sec + 1
  sec += 1