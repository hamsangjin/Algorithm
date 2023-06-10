import sys
input=sys.stdin.readline
N = int(input()) #온라인 저지 회원수
user = []
# 리스트 형태로 입력 받기
for _ in range(N):
    user.append(list(input().split()))
    
# 나이를 기준으로 정렬
user.sort(key=lambda a: int(a[0]))
for i in range(N):
    print(user[i][0], user[i][1])