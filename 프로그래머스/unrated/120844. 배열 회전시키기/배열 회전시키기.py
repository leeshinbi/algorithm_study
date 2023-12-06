def solution(numbers, direction):
    answer = []

    if direction == "right":
        answer = [numbers[-1]] + numbers[:-1] # 마지막원소 + 마지막 원소를 제외한 나머지 원소

    elif direction == "left":
        answer = numbers[1:] + [numbers[0]] # 첫번째 원소를 제외한 나머지 원소 + 첫번째 원소 

    return answer
