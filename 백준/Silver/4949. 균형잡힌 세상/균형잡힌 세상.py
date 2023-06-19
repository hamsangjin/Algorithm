import sys

while(True):
  bracket = []
  input_ = input()
  # .일 경우 마지막 줄이기 때문에 종료
  if input_ == '.':
    break


  for char in input_:
    # (나 [면 리스트에 추가
    if char == '(' or char == '[':
      bracket.append(char)

    # ) 라면 리스트의 길이가 0이 아니고, 마지막 원소가 (인 경우엔 리스트에서 () 쌍 삭제하고 아니라면 리스트에 추가
    elif char == ')':
      if len(bracket) != 0 and bracket[-1] == '(':
        bracket.pop()
      else:
        bracket.append(char)
    # ] 라면 리스트의 길이가 0이 아니고, 마지막 원소가 [인 경우엔 리스트에서 [] 쌍 삭제하고 아니라면 리스트에 추가
    elif char == ']':
      if len(bracket) != 0 and bracket[-1] == '[':
        bracket.pop()  
      else:
        bracket.append(char)

    # 그렇게 한 줄의 문자열을 다 돌았을 때 리스트에 원소가 없다면 짝이 다 맞아 삭제된거이므로 yes 출력하고 아니라면 no 출력
  if len(bracket) == 0:
    print('yes')
  else:
    print('no')
