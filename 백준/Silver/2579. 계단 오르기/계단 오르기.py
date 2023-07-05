import sys

# 1. 한번에 1개 or 2개의 계단을 오를 수 있다.
# 2. 연속된 세개의 계단을 모두 밟아서는 안 된다.
# 3. 마지막 도착 계단은 반드시 밟아야 한다.

# 300이하의 자연수
n = int(sys.stdin.readline().strip())

# 계단의 점수 초기화
stairs = [0] * 301

# 1번째 계단은 0이 아닌 1부터 시작
for i in range(1, n+1):
    stairs[i] = int(sys.stdin.readline().strip())

# dp 배열 초기화
dp = [0] * 301

# for문 들어가기 전 필요한 층 정의
dp[1] = stairs[1]
dp[2] = stairs[1] + stairs[2]
dp[3] = max(stairs[3] + stairs[1], stairs[3] + stairs[2])

for i in range(4, n+1):
    # dp[3] = max(stairs[3] + stairs[2] + dp[0], stairs[3] + dp[1])
    # dp[n] = max(직전 칸에서 올라온 경우의 최대값 + 현재 계단, 전전칸에서 올라온 경우의 최대값 + 현재 계단)
    dp[i] = max(stairs[i] + stairs[i-1] + dp[i-3], stairs[i] + dp[i-2])

print(dp[n])