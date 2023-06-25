import sys

n, m, b = map(int, sys.stdin.readline().strip().split())
land = [list(map(int, sys.stdin.readline().strip().split())) for _ in range(n)]

lo = min([min(x) for x in land])
hi = max([max(x) for x in land])
INF = int(1e9)

def check(land, lv, b):
  # lv 걸리는 시간 -> return -> 불가능시에는 아주 큰 값
  sc = 0
  # 채워넣어야할 블록
  c = 0
  for i in range(n):
    for j in range(m):
      z = land[i][j] - lv

      # 현재 칸에서 lv을 뺐을 때 0보다 높을 경우
      if z > 0:
        # 인벤토리에 추가
        b += z
        # 2초 * 개수 
        sc += 2*z
      else:
        # 채워야할 블록 개수 및 시간(1초라서)
        c += -z
  if b < c:
    return INF
  return sc + c
      
msc = INF
mlv = 0

for lv in range(hi, lo-1, -1):
  sc = check(land, lv, b)
  
  # 평평하게 만들 수 있냐 ?
  if msc > sc:
    msc = sc
    mlv = lv
    
print(msc, mlv)