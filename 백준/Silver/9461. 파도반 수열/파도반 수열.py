import sys

T = int(sys.stdin.readline().strip())

for _ in range(T):
    N = int(sys.stdin.readline().strip())
    nums = [0, 1, 1, 1, 2]
    if N > 4:
        for i in range(5, N+1):
            nums.append(nums[i-2] + nums[i-3])

    print(nums[N])