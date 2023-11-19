def solution(n):
    
    digits = list(str(n)) # 정수->문자열
    
    sorted_digits = sorted(map(str,digits),reverse=True) 
    
    answer = int(''.join(map(str,sorted_digits))) #각 요소 사이에 아무 문자도 추가하지 않고 합침 & 문자열->정수

    return answer
