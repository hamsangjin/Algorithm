import sys

arr = [0, 1, 2, 3]

for i in range(4, 1001):
    arr.append((arr[i-1] + arr[i-2]) % 10007)

print(arr[int(sys.stdin.readline().strip())])