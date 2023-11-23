def solution(s):
    answer = ''
    words = s.split(" ") #공백 기준으로 단어 나눔
    
    for word in words:
        for i in range(len(word)):
            if i%2 == 0:
                answer += word[i].upper() #대문자
            else:
                answer += word[i].lower() #소문자
        answer += ' ' # 단어 사이에 공백 추가 
    
    return answer[:-1] # 마지막에 추가된 공백 제거