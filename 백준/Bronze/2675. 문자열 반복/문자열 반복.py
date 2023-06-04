n = int(input())
for i in range(n):
  result = ''
  a, b = map(str, input().split())
  for i in range(len(b)):
    result = result + (b[i] * int(a))
  print(result)