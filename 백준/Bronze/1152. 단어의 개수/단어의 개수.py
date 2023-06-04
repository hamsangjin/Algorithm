# 앞 뒤 공백 없애기
n = input().strip()

# 단어 수를 세야해서 공백 수보다 +1
blank_count = 1

for i in range(len(n)):
  if n[i] == ' ':
    blank_count += 1

# 아무것도 입력이 없는 경우 0을 출력
if len(n) >= 1:
  print(blank_count)
else:
  print(0)