import sys

# -를 기준으로 나누고
# -가 없으면 split된 것도 없으므로 arr의 가장 첫 번째 원소 다 더하기
# -가 존재하는 경우 첫 '-' 뒤로 나오는 숫자들을 두 번째 '-' 나올 때까지 다 더하고(이미 -를 기준으로 split했기 때문에 나머지는 +일 거임) 첫 번째 원소 다 더한거에서 다 뺀다.

arr = list(map(str, sys.stdin.readline().strip().split('-')))
answer = 0
for i in arr[0].split('+'):
  answer += int(i)

for i in arr[1:]:
  for j in i.split('+'):
    answer -= int(j)

print(answer)