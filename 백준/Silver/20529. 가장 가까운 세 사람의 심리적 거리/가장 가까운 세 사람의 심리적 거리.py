import sys

T = int(sys.stdin.readline().strip())

for _ in range(T):
    N = int(sys.stdin.readline().strip())
    MBTI = list(map(str, sys.stdin.readline().strip().split()))

    # 비둘기집 원리
    # 32명이 넘어가면 무조건 세 명 이상이 MBTI가 겹친다.
    # 따라서 0을 출력
    if N > 32:
      print(0)

    else:
      answer = 999999
      for i in range(N):
         for j in range(N):
            for k in range(N):
              tmp = 0
              if i == j or j == k or i == k:
                continue
              # 모든 MBTI끼리 비교해
              # 최소값(가까운 거리) 찾기
              for x in range(4):
                if MBTI[i][x] != MBTI[j][x]:
                    tmp += 1
                if MBTI[j][x] != MBTI[k][x]:
                    tmp += 1
                if MBTI[i][x] != MBTI[k][x]:
                    tmp += 1
              answer = min(tmp, answer)
      print(answer)