l = input().upper()
c=0

for i in set(l):
  if l.count(i) > c :
    c=l.count(i)
    d=i
  elif l.count(i) == c: 
      d='?'
print(d)