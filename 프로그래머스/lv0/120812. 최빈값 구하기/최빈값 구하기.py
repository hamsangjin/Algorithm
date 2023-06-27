from collections import Counter

def solution(array):
    counter = Counter(array)  # 각 원소의 등장 횟수를 카운트하는 Counter 객체 생성
    max_count = max(counter.values())  # 등장 횟수의 최댓값을 찾음

    # 최빈값이 여러 개인지 확인
    mode_values = []
    for num, count in counter.items():
        if count == max_count:
            mode_values.append(num)
            
    if len(mode_values) > 1:
        return -1  # 최빈값이 여러 개면 -1 반환

    return mode_values[0]  # 최빈값 반환
