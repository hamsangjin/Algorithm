import sys

i = 1
while(True):
  a = sys.stdin.readline().strip()
  if a == '0':
    break
  
  print('Case', str(i) + ': Sorting... done!')
  i += 1