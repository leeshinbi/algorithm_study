def solution(n):
    answer = []
    
    digits = list(str(n))
    
    reversed_digits = list(reversed(digits))
    
    answer = list(map(int,reversed_digits))
    
    return answer