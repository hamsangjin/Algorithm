result = []

for i in range(9):
    a = int(input())
    result.append(a)
print(max(result))
print(result.index(max(result))+1)