def solution(s):

    stack = []
    answer = True

    for char in s:
        if char == "(":
            stack.append(char)
        else:
            if stack:
                stack.pop()
            else:
                answer = False
                break
    
    if stack:
        return False
    else:
        return answer