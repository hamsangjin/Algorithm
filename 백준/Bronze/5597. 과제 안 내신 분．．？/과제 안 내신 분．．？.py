n = list(range(1, 31))
for i in range(28):
    num = int(input())
    n.remove(num)
for i in n:
    print(i)