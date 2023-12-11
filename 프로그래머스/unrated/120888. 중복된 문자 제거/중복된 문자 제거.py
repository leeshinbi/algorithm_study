def solution(my_string):
    answer = ''
    seen_chars = set()
    
    for char in my_string:
        if char not in seen_chars:
            answer+=char
            seen_chars.add(char)
            
    return answer