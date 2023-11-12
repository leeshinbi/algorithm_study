def solution(k, score):
    answer = []
    hall_of_fame = [] 
    
    for i in score:
        if len(hall_of_fame)<k:
            hall_of_fame.append(i)
        else:
            if min(hall_of_fame) < i:
                hall_of_fame.remove(min(hall_of_fame))
                hall_of_fame.append(i)
        answer.append(min(hall_of_fame))
    return answer
