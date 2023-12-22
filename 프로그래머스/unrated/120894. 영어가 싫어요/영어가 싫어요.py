def solution(numbers):
    
    word_to_number = {
        "zero": 0,
        "one": 1,
        "two": 2,
        "three": 3,
        "four": 4,
        "five": 5,
        "six": 6,
        "seven": 7,
        "eight": 8,
        "nine": 9
    }

    answer = 0
    current_word = ""
    
    for char in numbers:
        current_word += char
        if current_word in word_to_number:
            answer =  answer * 10 + word_to_number[current_word]
            current_word = ""
            
    return answer