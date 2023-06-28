from collections import deque
def solution(queue1, queue2):
    dq1 = deque(queue1)
    dq2 = deque(queue2)

    answer = 0
    dqsum = sum(dq1) + sum(dq2)
 
    if dqsum % 2 == 1:
        return -1
    
    sum1 = sum(dq1)
    sum2 = sum(dq2)
    
    while(sum1 != sum2):
        if sum1 > sum2:
            tmp = dq1.popleft()
            dq2.append(tmp)
            sum1 -= tmp
            sum2 += tmp
            answer += 1
        else:
            tmp = dq2.popleft()
            dq1.append(tmp)
            sum1 += tmp
            sum2 -= tmp
            answer += 1

        if answer > len(queue1)**2:
            return -1

    return answer