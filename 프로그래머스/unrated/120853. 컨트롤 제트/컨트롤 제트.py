def solution(s):
    numbers = s.split()
    stack = []
    answer = 0  

    for element in numbers:
        if element == "Z":
            POP = stack.pop() #POP 변수 설정
            answer -= POP  
        else:
            num = int(element)
            stack.append(num)
            answer += num

    return answer
