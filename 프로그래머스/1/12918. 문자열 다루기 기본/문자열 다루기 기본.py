def solution(s):
    answer = True
    
    # 길이가 4 또는 6이 아니면 False 반환
    if len(s) != 4 and len(s) != 6:
        return False
    
    # 문자열이 모두 숫자로 이루어져 있는지 여부를 확인하는 메서드
    return s.isdigit()

    return answer