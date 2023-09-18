import sys

N, M = map(int, sys.stdin.readline().strip().split())
nums = sorted(list(map(int, sys.stdin.readline().strip().split())))
ch = [0] * N
temp = []

def n_m():
  if len(temp) == M:
    print(*temp)
    return
  
  pre = 0

  for i in range(N):
    # 해당 인덱스에 방문하지 않았으면서, 중복된 수열이 아닌 경우
    if ch[i] == 0 and pre != nums[i]:
      # 해당 인덱스 방문 체크
      ch[i] = 1
      # 출력할 temp에 해당 수 추가
      temp.append(nums[i])
      # 중복된 수열인지 확인할 변수를 해당 수로 변경
      pre = nums[i]

      n_m()

      # 호출 끝났다면 방문 취소로 체크
      ch[i] = 0
      # 출력할 temp에서 해당 수 제거
      temp.pop()

n_m()