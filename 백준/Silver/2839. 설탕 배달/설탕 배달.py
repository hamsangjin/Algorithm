import sys


N = int(sys.stdin.readline().strip())


result_5 = N // 5
remain_5 = N - (result_5*5)

while(True):
  if remain_5 % 3 == 0 and result_5 != -1:
    result_5 += remain_5 // 3
    break
  elif result_5 != -1:
    result_5 -= 1
    remain_5 = N - (result_5*5)
  else:
    result_5 = -1
    break


print(result_5)