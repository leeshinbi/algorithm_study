def solution(numbers, k):
    current = 0  # 현재 던지는 사람의 자리(=인덱스)
    for i in range(k-1):
        current = (current + 2) % len(numbers)
    return numbers[current]