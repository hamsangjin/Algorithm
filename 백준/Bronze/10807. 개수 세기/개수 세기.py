n = int(input())
nums = list(map(int,input().split()))
v = int(input())
v_count = 0

for i in nums:
    if i == v:
        v_count += 1
print(v_count)