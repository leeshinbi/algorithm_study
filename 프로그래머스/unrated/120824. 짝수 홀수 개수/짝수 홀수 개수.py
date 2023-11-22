def solution(num_list):
    answer = []
    
    count_2 = 0
    count_3 = 0
    
    for i in num_list:
        if i % 2 == 0:
            count_2+=1
        else:
            count_3+=1
    answer.append(count_2)
    answer.append(count_3)
    return answer