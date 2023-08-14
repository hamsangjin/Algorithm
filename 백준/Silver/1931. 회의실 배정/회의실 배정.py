import sys

N = int(sys.stdin.readline().strip())

meeting = []
for _ in range(N):
  meeting.append(list(map(int, sys.stdin.readline().strip().split())))

# 1. 끝나는 시간을 기준으로 오름차순 정렬
# 2. 시작하는 시간을 기준으로 오름차순 정렬
meeting.sort(key = lambda x :(x[1], x[0]))

temp = 0      # 회의의 마지막 시간을 저장할 변수
answer = 0    # 회의의 개수를 저장할 변수

for start, end in meeting:
  # 시작 시간이 현재 회의의 마지막 시간보다 크거나 같은 경우
  if start >= temp:
    # 회의를 시작할 수 있으므로 회의의 개수 + 1
    answer += 1
    # 현재 회의의 마지막 시간(end)으로 마지막 시간(temp) 저장
    temp = end
    
print(answer)