import sys

N = int(sys.stdin.readline().strip())

for i in range(N):
  stack = []

  line_ = sys.stdin.readline().strip()

  for char in line_:
    # (나 [면 리스트에 추가
    if char == '(':
      stack.append(char)

    # ) 라면 리스트의 길이가 0이 아니고, 마지막 원소가 (인 경우엔 리스트에서 () 쌍 삭제하고 아니라면 리스트에 추가
    elif char == ')':
      if len(stack) != 0 and stack[-1] == '(':
        stack.pop()
      else:
        stack.append(char)

    # 그렇게 한 줄의 문자열을 다 돌았을 때 리스트에 원소가 없다면 짝이 다 맞아 삭제된거이므로 yes 출력하고 아니라면 no 출력
  if len(stack) == 0:
    print('YES')
  else:
    print('NO')