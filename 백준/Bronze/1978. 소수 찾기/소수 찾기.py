import sys

n = int(sys.stdin.readline().strip())
t = list(map(int, sys.stdin.readline().strip().split()))

n_list = []

for i in t:
  n_count = 0
  # 1부터 해당 값까지 다 나눠보기
  for j in range(1, i+1):
    # 나머지가 있다면 n_count 1 증가
    if i % j > 0:
      n_count += 1
  # 해당 값에서 n_count를 뺀 값이 2(1과 본인)이라면 소수다 !
  if i-n_count == 2:
    n_list.append(i)

print(len(n_list))