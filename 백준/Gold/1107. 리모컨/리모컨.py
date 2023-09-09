import sys

# 목표 채널 번호
N = int(sys.stdin.readline().strip())

# 고장난 버튼의 개수
M = int(sys.stdin.readline().strip())

broken = []
# 고장난 버튼이 있는 경우에만 추가
if M != 0:
  broken = list(map(int, sys.stdin.readline().strip().split()))

# 채널 100에서 +나 -만 사용해 이동하는 경우
ans = abs(100 - N)

for x in range(1000001):
  num = str(x)

  for i in range(len(num)):
    # 현재 x의 자리수 하나하나가 버튼에 존재하는지 확인
    if int(num[i]) in broken:
      break
    # 마지막 자리수까지 위 if문(버튼 존재)을 통과했냐 ?
    elif i == len(num) - 1:
      # 최소 횟수 = min(현재 최소 횟수, abs(목표 채널 - x 채널) + x 채널의 길이(버튼 누르는 횟수)
      ans = min(ans, abs(x-N) + len(num))

print(ans)