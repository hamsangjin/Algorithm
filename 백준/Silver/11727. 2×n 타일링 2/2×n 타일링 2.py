import sys

arr = [0, 1, 3, 5]

for i in range(4, 1001):
    arr.append((arr[i-1] + arr[i-2] * 2) % 10007)

print(arr[int(sys.stdin.readline().strip())])

# 2x1 = 1
# 2x2 = 3
# 2x3 = 5
# 2x4 = 11
# 2x5 = 21
# 라는 규칙이 생김

# 즉, 점화식 = arr[i-1] + arr[i-2] * 2