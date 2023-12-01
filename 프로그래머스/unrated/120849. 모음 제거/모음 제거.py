def solution(my_string):
    answer = ''
    vowels = "aeiou"
    answer = ''.join(char for char in my_string if char not in vowels)
    return answer