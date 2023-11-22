def solution(s):
    answer = ''
    
    if len(s) % 2 == 0:
        mid = len(s) // 2
        answer = s[mid-1:mid+1] #사실상 mid-1 ~ mid까지 가져옴
        
    else:
        mid = len(s) //2
        answer = s[mid]
        
    return answer