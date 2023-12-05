def solution(array):
    answer = []
    
    max = array[0]
    max_index = 0
    
    for i in range(1, len(array)):
        if array[i] > max:
            max = array[i]
            max_index = i
            
    return [max, max_index]