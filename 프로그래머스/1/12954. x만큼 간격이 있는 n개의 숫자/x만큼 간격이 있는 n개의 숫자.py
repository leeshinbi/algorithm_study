def solution(x, n):
    answer = []
    result = x
    
    for i in range(n):
        answer.append(result)
        result += x
    
    return answer