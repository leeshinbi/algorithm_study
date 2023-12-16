def solution(s):
    char_count = {}
    
    for char in s:
        if char in char_count:
            char_count[char] += 1
        else:
            char_count[char] = 1
            
    unique_chars = [char for char, count in char_count.items() if count == 1 ]
    unique_chars.sort()
    
    answer = ''.join(unique_chars)
    
    return answer
    
    