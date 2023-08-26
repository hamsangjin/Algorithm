import sys

score = 0
for i in range(5):
  x = int(sys.stdin.readline().strip())
  if x < 40:
    score += 40
  else:
    score += x

print(int(score / 5))