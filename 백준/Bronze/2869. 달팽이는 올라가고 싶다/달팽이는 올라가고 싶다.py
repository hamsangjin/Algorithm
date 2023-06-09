import sys
import math

a, b, v = map(int, sys.stdin.readline().strip().split())

# v에 -b 하는 이유 : 정상에 도달했는데도 밤에 미끄러지는 걸 방지
print(math.ceil((v - b) / (a - b)))
