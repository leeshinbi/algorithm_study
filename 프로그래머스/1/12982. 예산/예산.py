def solution(d, budget):
    answer = 0
    count = 0
    d.sort()
    
    for cost in d:
        if budget>=cost:
            budget -= cost
            count +=1
        else:
            break
    return count