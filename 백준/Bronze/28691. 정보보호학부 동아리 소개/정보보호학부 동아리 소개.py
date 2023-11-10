import sys
dict = {}
dict['M'] = 'MatKor'
dict['W'] = 'WiCys'
dict['C'] = 'CyKor'
dict['A'] = 'AlKor'
dict['$'] = '$clear'

print(dict[sys.stdin.readline().strip()])