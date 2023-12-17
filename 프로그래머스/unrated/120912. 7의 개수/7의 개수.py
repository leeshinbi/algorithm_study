def solution(array):
    answer = 0
    
    for num in array:
        # 숫자를 문자열로 변환하여 각 자리 숫자를 확인
        for digit in str(num):
            # 만약 자리 숫자가 '7'이면 answer를 1 증가
            if digit == '7':
                answer += 1
    
    return answer