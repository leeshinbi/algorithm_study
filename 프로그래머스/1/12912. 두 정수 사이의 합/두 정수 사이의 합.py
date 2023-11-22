def solution(a, b):
    sum = 0
    
    if a <= b: #a와b의 대소관계 파악
        for i in range(a, b+1):
            sum += i
    else:
        for i in range(b, a+1):
            sum += i
    
    return sum