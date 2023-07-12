import sys

_, M = map(int, sys.stdin.readline().strip().split())

nums = list(map(int, sys.stdin.readline().strip().split()))

prefix_sum = [0]

temp = 0
for num in nums:
    temp += num
    prefix_sum.append(temp)

for _ in range(M):
    i, j = map(int, sys.stdin.readline().strip().split())

    print(prefix_sum[j] - prefix_sum[i-1])