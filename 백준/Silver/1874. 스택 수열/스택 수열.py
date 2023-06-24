import sys

n = int(sys.stdin.readline().strip())

result = []
stack = []

# 현재 가리키고 있는 값
cur = 1

for _ in range(n):
  # 수열 입력 받기
  seq = int(sys.stdin.readline().strip())
  # 현재 커서 값이 입력된 수열보다 작거나 같냐 ?
  # 그럼 커서 값을 스택에 쌓아 입력된 수열 나올 때까지
  while cur <= seq:
    stack.append(cur)
    result.append('+')
    cur += 1

  # 스택 가장 상위 값이 seq랑 같냐 ?
  # 그럼 빼서 출력해
  if stack[-1] == seq:
    stack.pop()
    result.append('-')
  # 아니라면 불가능한것이므로 NO 출력해
  else:
    result.clear()
    result.append('NO')
    break

for answer in result:
  print(answer)