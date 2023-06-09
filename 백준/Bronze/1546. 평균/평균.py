import sys

n = int(sys.stdin.readline().strip())
score = list(map(int, sys.stdin.readline().strip().split()))
sum = 0
for i in score:
  sum += i / max(score) * 100

print(sum/len(score))