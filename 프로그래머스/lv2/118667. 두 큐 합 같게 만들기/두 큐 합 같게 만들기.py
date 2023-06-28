from collections import deque 
def solution(queue1, queue2):
    s1 = sum(queue1) 
    s2 = sum(queue2) 
    
    sumN = s1 + s2

    if sumN % 2 == 1:
        return -1
    
    dq1 = deque(queue1)
    dq2 = deque(queue2)

    cnt1, cnt2 = 0, 0

    sumN = sumN // 2

    # 이 이상은 그냥 회전하는거임
    limit = len(queue1)*2 

    while cnt1 < limit and cnt2 < limit:
        if sumN == s1: 
            return cnt1 + cnt2
        if s1 > sumN: 
            s1 -= dq1[0] 
            s2 += dq1[0]
            dq2.append(dq1.popleft())
            cnt1 += 1 
        else:
            s1 += dq2[0]
            s2 -= dq2[0] 
            dq1.append(dq2.popleft()) 
            cnt2 += 1
    return -1

# sum을 계속하므로 O(n)을 계속 하는거임
# from collections import deque
# def solution(queue1, queue2):
#     dq1 = deque(queue1)
#     dq2 = deque(queue2)

#     answer = 0
#     dqsum = sum(dq1) + sum(dq2)
#     if dqsum % 2 == 1:
#         return -1

#     while(sum(dq1) != sum(dq2)):
#         if sum(dq1) > sum(dq2):
#             dq2.append(dq1.popleft())
#             answer += 1
#         else:
#             dq1.append(dq2.popleft())
#             answer += 1

#         if answer > len(queue1)**2:
#             return -1

#     return answer