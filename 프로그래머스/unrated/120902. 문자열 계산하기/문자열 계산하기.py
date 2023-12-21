def solution(my_string):
    elements = my_string.split()
    
    answer = int(elements[0])
    
    for i in range(1,len(elements),2):
        if elements[i]=='+':
            answer+=int(elements[i+1])
        else:
            answer-=int(elements[i+1])
    return answer
