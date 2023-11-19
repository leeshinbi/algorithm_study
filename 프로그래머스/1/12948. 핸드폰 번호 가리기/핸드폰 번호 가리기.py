def solution(phone_number):
    answer = ''

    digits = list(map(str, phone_number))

    for i in range(len(digits) - 4):
        answer += '*'

    answer += ''.join(digits[-4:])

    return answer
