import sys

t = int(sys.stdin.readline().strip())

# 테스트 케이스 수 만큼 반복
for i in range(t):

  k = int(sys.stdin.readline().strip())
  n = int(sys.stdin.readline().strip())

  # 0층에서 1호부터 n호까지의 사람 수 저장
  peoples = [i for i in range(1, n+1)]

  # 층 수 - 1 반복
  for j in range(k-1):
    # 호수 덧셈
    for l in range(1, n):
      # 현재 people[l] 값(아래층 같은 호수의 거주민 수)과 
      # 같은 층 호수-1 값(아래층 같은 호수의 거주민 수만 더하지 않은 값)을 더한다
      peoples[l] += peoples[l-1]

  print(sum(peoples))