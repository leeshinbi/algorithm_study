def solution(n):
    
    rest = ''
    
    while n>0:
        rest += str(n%3) # 3으로 나눈 나머지를 문자열로 변환하여 추가 (3진법)
        n = n//3   # 몫의 값을 갱신
    return int(rest,3)

