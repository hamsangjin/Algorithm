import sys

N = int(sys.stdin.readline())
paper = [list(map(int, sys.stdin.readline().split())) for _ in range(N)] 

result = [0, 0]

def Divide(x, y, N):
  # 현재 구역의 첫 번째 부분의 색 저장
  color = paper[x][y]
  for i in range(x, x+N) :
    for j in range(y, y+N) :
      # 현재 구역의 첫 번째 부분의 색과 다를 경우 
      # 1/4로 분할해 재귀 호출
      if color != paper[i][j] :
        # 2사분면
        Divide(x, y, N//2)
        # 1사분면
        Divide(x, y+N//2, N//2)
        # 3사분면
        Divide(x+N//2, y, N//2)
        # 4사분면
        Divide(x+N//2, y+N//2, N//2)
        
        return
  # 현재 구역의 색이 다 동일할 경우 색깔 별로 +1
  if color == 0:
    result[0] += 1
  else :
    result[1] += 1

# [0, 0]을 기준으로 함수 호출
Divide(0, 0, N)

# 정답 출력
print(result[0])
print(result[1])