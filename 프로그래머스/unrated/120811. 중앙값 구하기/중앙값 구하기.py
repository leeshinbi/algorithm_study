def solution(array):
    array.sort(reverse=True)
    
    mid = array[len(array)//2]
    return mid