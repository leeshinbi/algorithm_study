def solution(s1, s2):
    answer = 0
    
    for i in s1: #s1을 순회하면서
        if i in s2: #s2에도 있는지 확인
            answer+=1
    
    return answer