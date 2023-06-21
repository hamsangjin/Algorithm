import sys

K = int(sys.stdin.readline().strip())

stack = []

for i in range(K):
  num = int(sys.stdin.readline().strip())
  stack.append(num) if num != 0 else stack.pop()

print(sum(stack))