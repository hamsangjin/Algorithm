input = input()
output_list = []
output = ''
for i in range(len(input)):
    if input[i].islower() == True:
        output_list.append(input[i].upper())
    else:
        output_list.append(input[i].lower())

for i in output_list:
    output = output + i
print(output)