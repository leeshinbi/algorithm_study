def solution(age):
    age_str = str(age)
    answer = ''

    for digit in age_str:
        answer += chr(ord('a') + int(digit))

    return answer
