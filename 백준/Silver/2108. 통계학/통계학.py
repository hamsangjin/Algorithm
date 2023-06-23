import sys
from collections import Counter

N = int(sys.stdin.readline().strip())

nums = []
for _ in range(N):
  nums.append(int(sys.stdin.readline().strip()))

nums.sort()
avg = sum(nums) / len(nums)

def my_round(val):
  if val - int(val) >= 0.5:
    return int(val)+1
  else:
    return int(val)

# 평균값
print(round(sum(nums) / len(nums)))
# print(my_round(sum(nums) / len(nums)))


# 중앙값
print(nums[len(nums) // 2])

# 최빈값
cnt = Counter(nums)
# 상위 두 개만 보기
if len(cnt) != 1:
  mode = cnt.most_common(2)
  if mode[0][1] == mode[1][1]:
    print(mode[1][0])
  else:
    print(mode[0][0])
else:
  mode = cnt.most_common(1)
  print(mode[0][0])

# 범위
print(nums[len(nums)-1]-nums[0])