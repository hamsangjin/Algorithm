import sys

# N, M 입력
N, M = map(int, sys.stdin.readline().strip().split())

trees = list(map(int, sys.stdin.readline().strip().split()))

# 1 ~ 나무 중 가장 큰 값
start, end = 1, max(trees)

# start와 end가 같아질 때까지
# 즉, 적절한 절단기의 최대값을 찾을 떄까지 반복
while start <= end:
  
  # 중간 위치
  mid = (start + end) // 2

  # 나무 자르기
  temp = 0
  for tree in trees:
    # 나무의 높이가 절단기 높이보다 큰 경우에만
    if tree >= mid:
      # 잘라서 잘린만큼 저장
      temp += tree - mid

  # 자른 나무들의 합(temp)이 M 이상이라면
  if temp >= M:
    # 시작점 변경
    start = mid + 1
  # M 미만이라면
  else:
    # 끝점 변경
    end = mid -1

# 정답 출력
print(end)