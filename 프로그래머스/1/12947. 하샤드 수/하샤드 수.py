def solution(x):
    answer = True
    
    digits = list(map(int,str(x))) #x를 문자열로 변환하여 각 자릿수를 리스트에 저장 
    
    digits_sum = sum(digits)
    
    if x % digits_sum == 0:
        answer = True
    else:
        answer = False
    
    return answer