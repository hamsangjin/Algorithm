import sys

gathers = ['a', 'e', 'i', 'o', 'u']

line_ = ''
while True:
    cnt = 0
    line_ = sys.stdin.readline().strip()
    for str in line_:
        if str.lower() in gathers:
            # print(str.lower())
            cnt += 1
    if line_ == '#':
        break
    else:
        print(cnt)