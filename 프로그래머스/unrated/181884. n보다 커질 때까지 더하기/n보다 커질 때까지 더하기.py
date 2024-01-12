def solution(numbers, n):
    answer = 0
    for number in numbers:
        if answer > n:
            break
        answer += number
    return answer