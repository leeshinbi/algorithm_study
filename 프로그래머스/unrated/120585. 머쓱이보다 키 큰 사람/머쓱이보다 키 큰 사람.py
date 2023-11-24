def solution(array, height):
    answer = 0
    count = 0
    
    for i in range(len(array)):
        if height<array[i]:
            count+=1
    answer = count
    return answer