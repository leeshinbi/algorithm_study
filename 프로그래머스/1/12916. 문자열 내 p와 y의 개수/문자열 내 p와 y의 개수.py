def solution(s):
    # 대문자와 소문자를 구별하지 않고 'p'와 'y'의 개수를 세기 위해 모두 소문자로 변경
    s = s.lower()

    # 'p'와 'y'의 개수를 각각 세기
    count_p = s.count('p')
    count_y = s.count('y')

    # 개수 비교 후 결과 반환
    return count_p == count_y