def solution(a, b, n):
    answer = 0
    
    while(n>=a):
        remain_bottle = n%a # 남은 콜라 병 수 
        n = (n//a)*b # 현재 받은 콜라 병 수 
        answer += n # 받은 콜라 병 수를 답안에 저장
        n+=remain_bottle # 다음 마트갈 때 남은 콜라 병 수를 더함 

    return answer