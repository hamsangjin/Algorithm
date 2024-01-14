def solution(my_strings, parts):
    answer = ''
    n = len(my_strings)
    for i in range(n):
        answer += my_strings[i][parts[i][0]:parts[i][1]+1]
        
    return answer