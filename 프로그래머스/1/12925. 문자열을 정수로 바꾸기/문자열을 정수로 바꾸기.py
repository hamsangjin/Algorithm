def solution(s):
    try:
        return int(s)
    except:
        return -1*int(s[1:]) if s[0] == '-' else int(s[1:])