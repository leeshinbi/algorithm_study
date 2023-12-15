def solution(my_string):
    answer = 0
    current_number = 0

    for char in my_string:
        if char.isdigit():
            current_number = current_number * 10 + int(char)
        else:
            answer += current_number
            current_number = 0
            
    answer += current_number

    return answer


