def solution(people, limit): 
    # 두 명밖에 탈 수 없으니 가장 무거운 한 명, 가장 가벼운 한 명 태워야함
    # 무조건 limit은 한 명 태울 수 있는 무게니까 만약 두 명 못 태운다고 하면 한 명만 태우면 됨
    # 왜냐 ? 가장 가벼운 한 명을 못태우면 다른 누구도 더 태울 수 없기 때문에
    answer = 0
    start = 0
    end = len(people) - 1 
    
    people.sort()
    while start <= end:
        people_sum = people[start] + people[end]

        if people_sum <= limit:
            # 한 번에 두 명 옮김
            answer += 1
            # 따라서 두 명 제외
            start += 1
            end -= 1 
        else:
            # 한 명만 옮김
            answer += 1 
            # 따라서 한 명 제외
            end -= 1
    return answer