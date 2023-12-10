def solution(order):
    answer = 0
    str_order = str(order)
    
    for num in str_order:
        if num in '369':
            answer += 1
            
    return answer