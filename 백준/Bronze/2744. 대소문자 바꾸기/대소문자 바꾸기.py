input = input()
output = ''
for i in range(len(input)):
    if input[i].islower() == True:
        output = output + input[i].upper()
    else:
        output = output + input[i].lower()

print(output)