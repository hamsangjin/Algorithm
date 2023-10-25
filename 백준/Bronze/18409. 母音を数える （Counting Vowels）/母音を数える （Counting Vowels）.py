import sys

i = 0
strs = ['a', 'i', 'u', 'e', 'o']
_ = sys.stdin.readline().strip()
a = sys.stdin.readline().strip()
for b in a:
  if b in strs:
    i += 1

print(i)