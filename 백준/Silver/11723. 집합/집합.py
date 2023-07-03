import sys

M = int(sys.stdin.readline().strip())

S = []

for _ in range(M):
  commands= sys.stdin.readline().strip().split()
  if len(commands) == 2:
    commands[1] = int(commands[1])
  if commands[0] == 'add':
    if commands[1] not in S:
      S.append(commands[1])
  elif commands[0] == 'remove':
    if commands[1] in S:
      S.pop(S.index(commands[1]))
  elif commands[0] == 'check':
    if commands[1] in S:
      print(1)
    else:
      print(0)
  elif commands[0] == 'toggle':
    if commands[1] in S:
      S.pop(S.index(commands[1]))
    else:
      S.append(commands[1])
  elif commands[0] == 'all':
    S = list(range(1, 21))
  elif commands[0] == 'empty':
    S.clear()