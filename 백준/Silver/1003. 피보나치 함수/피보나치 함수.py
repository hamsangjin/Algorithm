import sys

T = int(sys.stdin.readline().strip())

# fb(0) ~ fb(1)까지의 0의 개수
zeros = [1, 0]

# fb(0) ~ fb(1)까지의 1의 개수
ones = [0, 1]

# N이 40보다 작거나 같은 자연수이므로 fb(40)까지의 값을 저장
for i in range(2, 41):
    zeros.append(zeros[i-1] + zeros[i-2])
    ones.append(ones[i-1] + ones[i-2]) 

for _ in range(T):
    n = int(sys.stdin.readline().strip())
    print(zeros[n], end=' ')
    print(ones[n])
