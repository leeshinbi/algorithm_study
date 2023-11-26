def solution(money):
    answer = []
    
    cup = money//5500
    remain_money = money%5500
    
    answer.append(cup)
    answer.append(remain_money)
    return answer