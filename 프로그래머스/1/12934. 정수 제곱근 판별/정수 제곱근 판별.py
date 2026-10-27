def solution(n):
    return (n ** 0.5 + 1) ** 2 if (n ** 0.5) % 1 == 0 else -1