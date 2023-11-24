def solution(numbers):
    answer = 0
    
    sorted_numbers=sorted(numbers,reverse=True)
    
    answer = sorted_numbers[0]*sorted_numbers[1]
        
    return answer