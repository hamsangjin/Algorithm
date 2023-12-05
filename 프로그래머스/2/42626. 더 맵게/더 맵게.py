import heapq
from collections import deque

def solution(scoville, K):
    answer = 0
    
    heap = []
    for x in scoville:
        heapq.heappush(heap, x)
    
    while heap[0] < K:
        try:
            heapq.heappush(heap, heapq.heappop(heap) + heapq.heappop(heap) * 2)
        except IndexError:
            return -1
        
        answer += 1
    return answer
print(solution([1, 2, 3, 9, 10, 12], 200))