import sys
import math

N = int(sys.stdin.readline().strip())

dp = [0, 1]

for i in range(2, N+1):
    min_value = 1e9
    
    for j in range(1, int(math.sqrt(i)) + 1):
        min_value = min(min_value, dp[i - (j**2)])
    
    dp.append(min_value + 1)

print(dp[N])