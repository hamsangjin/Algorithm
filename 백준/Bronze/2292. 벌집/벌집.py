import sys
n = int(sys.stdin.readline().strip())
cal = 1
cnt = 1
while(n > cal):
  cal += 6 * cnt
  cnt += 1
print(cnt)