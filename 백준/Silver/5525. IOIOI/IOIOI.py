import sys

N = int(sys.stdin.readline().strip())
M = int(sys.stdin.readline().strip())
S = sys.stdin.readline().strip()

_list = [' ' for _ in range(N+1)]
for i in range(1, N+1):
  _list[i] = 'I' + ('OI' * i)

cnt = 0
for i in range(M):
  if S[i] == 'I':
    if S[i:i+(N*2+1)] == _list[N] and i <= M:
      cnt += 1

print(cnt)