import sys
import math

l = int(sys.stdin.readline().strip())
char = sys.stdin.readline().strip()


result = 0
for i in range(l):
  result += (ord(char[i]) - 96) * math.pow(31, i)
print(int(result % 1234567891))