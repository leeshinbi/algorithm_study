def solution(numbers):
    numbers.sort(reverse=True)
    
    max_num = None
    
    for i in range(len(numbers)-1): #마지막 원소까지 처리하기 위해 -1을 해준다. 
        num = numbers[i]*numbers[i+1]
        if max_num is None or num > max_num:
            max_num = num
    return max_num