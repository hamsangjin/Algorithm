import sys

t = list(sys.stdin.readline().strip())

alp = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y' ,'z']
result = ''

for i in alp:
  if t.count(i) == 0:
    result = result + '-1 '
  else:
    result = result + str(t.index(i)) + ' '

print(result)